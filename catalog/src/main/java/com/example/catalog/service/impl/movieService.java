package com.example.catalog.service.impl;

import com.example.catalog.model.MovieDTO;
import com.example.catalog.repository.feign.movieRepository;
import com.example.catalog.service.ImovieService;
import com.netflix.discovery.converters.Auto;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class movieService implements ImovieService {
    private movieRepository movieRepository;

    @Autowired
    public movieService(movieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @CircuitBreaker(name = "error", fallbackMethod = "listaVaciaMovie")
    @Override
    public List<MovieDTO> findMovieByGenre(String genre){
        return movieRepository.findByGenre(genre);
    }

    private List<MovieDTO> listaVaciaMovie(CallNotPermittedException exception){
        return Collections.emptyList();
    }
}
