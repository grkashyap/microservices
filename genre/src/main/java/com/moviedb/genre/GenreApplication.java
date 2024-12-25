package com.moviedb.genre;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.moviedb.genre.db.GenreRepository;

@SpringBootApplication
public class GenreApplication {

	private static final Logger log = LoggerFactory.getLogger(GenreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GenreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(GenreRepository repo) {
		return(args) -> {
			String strGenre = "Horror";
			log.info("Find movies by genre: ");
			repo.findMoviesByGenre(strGenre).forEach(genre -> {
				log.info(genre.toString());
			});
		};
	}

	

}