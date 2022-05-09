package com.example.moviesservice.service;

import com.example.moviesservice.model.Movie;

import java.util.List;
import java.util.Optional;

public interface ImovieService {
    Optional<Movie> findMovieById(Integer id);
    List<Movie> findAllMovies();
    void saveMovie(Movie movie);
    List<Movie> findMovieByGenre(String genre);
}
