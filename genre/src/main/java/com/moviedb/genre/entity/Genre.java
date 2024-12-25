package com.moviedb.genre.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Genre {

    @Id
    @Column(name="Movie_id")
    private long movieId;

    @Column(name="genre")
    private String genre;

    public long getMovieId() {
        return movieId;
    }
    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }
    
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Genre [MovieId=" + this.movieId + ", Genre=" + this.genre + "]";
    }

    public Genre(long movieId, String genre) {
        this.movieId = movieId;
        this.genre = genre;
    }

    protected Genre() { }
}