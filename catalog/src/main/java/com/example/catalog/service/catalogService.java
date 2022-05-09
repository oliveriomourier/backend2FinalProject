package com.example.catalog.service;

import com.example.catalog.model.MovieDTO;
import com.example.catalog.repository.feign.movieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class catalogService implements IcatalogService{
    movieRepository movieRepository;

    @Autowired
    public catalogService(movieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public MovieDTO findMovieById(Integer id){
        MovieDTO movie = movieRepository.findMovieById(id).get();
        return movie;
    }
}
