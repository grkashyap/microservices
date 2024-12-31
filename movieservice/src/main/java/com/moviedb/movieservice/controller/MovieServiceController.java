package com.moviedb.movieservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieServiceController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    private static final Logger log = LoggerFactory.getLogger(MovieServiceController.class);

    @GetMapping("/genres")
    public void getAllGenres() {
        String url = getServiceUrl("genre");
        log.info("URL: "+url);
        String response = restTemplateBuilder.build().getForObject(url, String.class);
        log.info(response);
    }

    private String getServiceUrl(String serviceName) {
        List<ServiceInstance> servicesList = discoveryClient.getInstances(serviceName);
        if(servicesList != null && servicesList.size() > 0) {
            return servicesList.get(0).getUri().toString();
        }
        return null;
    }
}