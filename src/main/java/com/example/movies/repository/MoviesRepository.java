package com.example.movies.repository;

import com.example.movies.domain.Movies;
import org.springframework.data.repository.CrudRepository;

public interface MoviesRepository extends CrudRepository<Movies, Long> {
}
