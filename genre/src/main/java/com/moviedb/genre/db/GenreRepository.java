package com.moviedb.genre.db;

import com.moviedb.genre.entity.Genre;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface GenreRepository extends ListCrudRepository<Genre, Long> {

    List<Genre> findMoviesByGenre(String strGenre);

    Genre findGenreByMovieId(long movieId);

    @Query("SELECT DISTINCT(genre) FROM Genre")
    List<String> getAllGenres();
}