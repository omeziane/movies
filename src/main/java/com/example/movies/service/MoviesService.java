package com.example.movies.service;

import com.example.movies.domain.Movies;
import com.example.movies.repository.MoviesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoviesService {

    private static final Logger LOG = LoggerFactory.getLogger(MoviesService.class);

    @Autowired
    MoviesRepository moviesRepository;

    public void addMovie(Movies movie) {
        moviesRepository.save(movie);
    }

    public List<Movies> getAllMovies() {
        List<Movies> list = (List<Movies>) moviesRepository.findAll();
        return list;
    }

}
