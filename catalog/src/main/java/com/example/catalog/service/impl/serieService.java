package com.example.catalog.service.impl;

import com.example.catalog.model.SerieDTO;
import com.example.catalog.repository.feign.serieRepository;
import com.example.catalog.service.IserieService;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class serieService implements IserieService {
    private serieRepository serieRepository;

    public serieService(serieRepository serieRepository){
        this.serieRepository = serieRepository;
    }

    @CircuitBreaker(name = "error",fallbackMethod = "listaVacia")
    @Override
    public List<SerieDTO> findSerieByGenre(String genre){
        return serieRepository.findSerieByGenre(genre);
    }

    private List<SerieDTO> listaVacia(CallNotPermittedException exception){
        return Collections.emptyList();}
}
