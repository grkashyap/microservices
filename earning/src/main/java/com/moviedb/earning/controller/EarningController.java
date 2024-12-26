package com.moviedb.earning.controller;

import com.moviedb.earning.db.EarningRepository;
import com.moviedb.earning.entity.Earning;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/earning")
public class EarningController {

    @Autowired
    private EarningRepository earningRepository;

    private static Logger log = LoggerFactory.getLogger(EarningController.class);

    @GetMapping("/{movieId}")
    public Earning getMovieEarning(@PathVariable long movieId) {

        log.info("Retrieving earnings of movie :"+movieId);
        Earning movieEarning = earningRepository.findEarningByMovieId(movieId);
        log.info("Earning: "+movieEarning);
        return movieEarning;
    }
}