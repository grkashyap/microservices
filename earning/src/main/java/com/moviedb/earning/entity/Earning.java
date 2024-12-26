package com.moviedb.earning.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class Earning {

    @Id
    @Column(name = "Movie_id")
    private long movieId;

    @Column(name = "Domestic")
    private BigDecimal domesticEarnings;

    @Column(name = "Worldwide")
    private BigDecimal worldwideEarnings;

    public long getMovieId() {
        return movieId;
    }
    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public BigDecimal getDomesticEarnings() {
        return domesticEarnings;
    }
    public void setDomesticEarnings(BigDecimal domesticEarnings) {
        this.domesticEarnings = domesticEarnings;
    }

    public BigDecimal getWorldwideEarnings() {
        return worldwideEarnings;
    }
    public void setWorldwideEarnings(BigDecimal worldwideEarnings) {
        this.worldwideEarnings = worldwideEarnings;
    }

    public Earning(long movieId, BigDecimal domesticEarnings, BigDecimal worldwideEarnings) {
        this.movieId = movieId;
        this.domesticEarnings = domesticEarnings;
        this.worldwideEarnings = worldwideEarnings;
    }

    protected Earning() { }

    @Override
    public String toString() {
        return "Earning{" +
                "movieId=" + movieId +
                ", domesticEarnings=" + domesticEarnings +
                ", worldwideEarnings=" + worldwideEarnings +
                '}';
    }
}