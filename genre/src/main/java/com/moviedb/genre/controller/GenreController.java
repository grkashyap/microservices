package com.moviedb.genre.controller;

import com.moviedb.genre.db.GenreRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.moviedb.genre.entity.Genre;

import java.util.List;

@RestController
@RequestMapping("/")
public class GenreController {

    @Autowired
    private GenreRepository genreRepository;

    private static final Logger log = LoggerFactory.getLogger(GenreController.class);

    @GetMapping
    public List<String> getGenres() {
        log.info("Retrieving all genres");
        List<String> genres = genreRepository.getAllGenres();
        log.info("Total Genres: "+genres.size());
        return genres;
    }

    @GetMapping("/{genre}")
    public List<Genre> getAllMoviesForGenre(@PathVariable String genre) {
        log.info("Retrieving all movies for the genre:  "+genre);
        List<Genre> movies = genreRepository.findMoviesByGenre(genre);
        log.info("Total movies: "+movies.size());
        return movies;
    }

    @GetMapping("/movie/{movieId}")
    public Genre getGenreForMovie(@PathVariable long movieId) {
        log.info("Retrieving genre of movie: "+movieId);
        Genre genre = genreRepository.findGenreByMovieId(movieId);
        log.info("Genre details: "+genre);
        return genre;
    }
}