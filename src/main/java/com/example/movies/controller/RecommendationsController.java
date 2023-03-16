package com.example.movies.controller;

import com.example.movies.domain.Movies;
import com.example.movies.service.MoviesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/recommendations")
public class RecommendationsController {

    private static final Logger LOG = LoggerFactory.getLogger(MoviesController.class);

    @Autowired
    private MoviesService moviesService;

    @RequestMapping(value = "/{genre}", method = RequestMethod.GET)
    public List<Movies> getPopularMovies(@PathVariable("genre") String genre) {
        LOG.info("Fetch Movies from selected Category "+ genre);
        List<Movies> list = moviesService.getAllMovies();
        List<Movies> ratedMovies = list.stream()
                .filter(c -> c.getGenre().equals(genre))
                .collect(Collectors.toList());
        return ratedMovies;
    }

}
