package com.moviedb.earning.db;

import com.moviedb.earning.entity.Earning;
import org.springframework.data.repository.CrudRepository;

public interface EarningRepository extends CrudRepository<Earning, Long> {

    Earning findEarningByMovieId(long movieId);
}