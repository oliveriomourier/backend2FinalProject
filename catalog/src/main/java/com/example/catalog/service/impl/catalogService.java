package com.example.catalog.service.impl;

import com.example.catalog.model.Catalog;
import com.example.catalog.model.MovieDTO;
import com.example.catalog.repository.feign.movieRepository;
import com.example.catalog.service.IcatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class catalogService implements IcatalogService {
    movieRepository movieRepository;

    @Autowired
    public catalogService(movieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Catalog findByGenre(String genre){
        List<MovieDTO> movies = movieRepository.findByGenre(genre);
        Catalog catalog = new Catalog();
        catalog.setGenre(genre);
        catalog.setMovies(movies);
        return catalog;
    }
}
