package com.example.movies.controller;

import com.example.movies.domain.Movies;
import com.example.movies.service.MoviesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    private static final Logger LOG = LoggerFactory.getLogger(MoviesController.class);

    @Autowired
    private MoviesService moviesService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Movies> getAllMovies() {
        LOG.info("Fetch all the Movies...");
        return moviesService.getAllMovies();
    }

    @RequestMapping(method = RequestMethod.POST)
    public List<Movies> addMovie(@RequestBody Movies movie) {
        LOG.info("Add a Movie...");
        moviesService.addMovie(movie);
        return moviesService.getAllMovies();
    }
}
