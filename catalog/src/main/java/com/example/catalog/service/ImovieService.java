package com.example.catalog.service;

import com.example.catalog.model.MovieDTO;

import java.util.List;

public interface ImovieService {
    List<MovieDTO> findMovieByGenre(String genre);
}
