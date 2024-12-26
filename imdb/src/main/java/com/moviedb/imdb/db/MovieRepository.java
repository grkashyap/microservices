package com.moviedb.imdb.db;

import com.moviedb.imdb.entity.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Long> {

    Movie findMoviesByMovieId(long movieId);

    List<Movie> findByTitleStartingWith(String movieTitle);
}