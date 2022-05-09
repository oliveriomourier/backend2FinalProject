package com.example.catalog.service;

import com.example.catalog.model.MovieDTO;

public interface IcatalogService {
    MovieDTO findMovieById(Integer id);
}
