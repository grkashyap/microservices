package com.moviedb.imdb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "IMDB")
public class Movie {

    @Id
    @Column(name = "Movie_id")
    private long movieId;

    @Column(name = "Title")
    private String title;

    @Column(name = "Rating")
    private double rating;

    @Column(name = "totalvotes")
    private long totalVotes;

    @Column(name = "Budget")
    private BigDecimal budget;

    @Column(name = "Runtime")
    private long runtime;

    public long getMovieId() {
        return movieId;
    }
    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    public long getTotalVotes() {
        return totalVotes;
    }
    public void setTotalVotes(long totalVotes) {
        this.totalVotes = totalVotes;
    }

    public BigDecimal getBudget() {
        return budget;
    }
    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public long getRuntime() {
        return runtime;
    }
    public void setRuntime(long runtime) {
        this.runtime = runtime;
    }

    public Movie(long movieId, String title, double rating, long totalVotes, BigDecimal budget, long runtime) {
        this.movieId = movieId;
        this.title = title;
        this.rating = rating;
        this.totalVotes = totalVotes;
        this.budget = budget;
        this.runtime = runtime;
    }

    protected Movie() {
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", title=" + title +
                ", rating=" + rating +
                ", totalVotes=" + totalVotes +
                ", budget=" + budget +
                ", runtime=" + runtime +
                '}';
    }
}