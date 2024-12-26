package com.moviedb.imdb.controller;

import com.moviedb.imdb.db.MovieRepository;
import com.moviedb.imdb.entity.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    private static final Logger log = LoggerFactory.getLogger(MovieController.class);

    @GetMapping("{movieId}")
    public Movie getMovieById(@PathVariable long movieId) {
        log.info("Retreving movie details by Id: "+movieId);

        Movie movie = movieRepository.findMoviesByMovieId(movieId);
        log.info("Movie: "+movie);
        return movie;
    }

    @GetMapping("/search/{title}")
    public List<Movie> searchForMovies(@PathVariable String title) {
        log.info("Searching for movies with title: "+title);

        List<Movie> movies = movieRepository.findByTitleStartingWith(title);
        log.info("Found "+movies.size()+" movies");
        return movies;
    }
}