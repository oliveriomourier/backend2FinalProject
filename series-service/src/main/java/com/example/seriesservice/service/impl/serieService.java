package com.example.seriesservice.service.impl;

import com.example.seriesservice.model.Serie;
import com.example.seriesservice.repository.serieRepository;
import com.example.seriesservice.service.ISerieservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class serieService implements ISerieservice {
    serieRepository serieRepository;

    @Autowired
    public serieService(serieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    @Override
    public Optional<Serie> findSerieById(Integer id){
        return serieRepository.findById(id);
    }

    @Override
    public List<Serie> findAll(){
        return serieRepository.findAll();
    }

    @Override
    public void saveSerie(Serie serie){
        serieRepository.save(serie);
    }

    @Override
    public List<Serie> findSerieByGenre(String genre){
        return serieRepository.findSerieByGenre(genre);
    }
}
