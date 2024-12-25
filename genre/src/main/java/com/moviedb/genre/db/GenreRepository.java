package com.moviedb.genre.db;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.moviedb.genre.entity.Genre;

public interface GenreRepository extends CrudRepository<Genre, Long> {

    List<Genre> findMoviesByGenre(String genre);

    Genre findGenreByMovieId(long movieId);
}