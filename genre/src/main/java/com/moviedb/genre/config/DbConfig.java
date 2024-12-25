package com.moviedb.genre.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@EnableJpaRepositories(basePackages = "com.moviedb.genre.db")
public class DbConfig {

    @Autowired Environment env;

    @SuppressWarnings("null")
    @Bean
	public DataSource datasource() {
		final DriverManagerDataSource datasource = new DriverManagerDataSource();

		datasource.setDriverClassName(env.getProperty("driverClassName"));
		datasource.setUrl(env.getProperty("url"));
		return datasource;
	}

}

@Configuration
@PropertySource("classpath:persistence.properties")
class SqliteConfig { }