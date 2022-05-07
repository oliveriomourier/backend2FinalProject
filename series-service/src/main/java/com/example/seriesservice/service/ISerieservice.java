package com.example.seriesservice.service;

import com.example.seriesservice.model.Serie;

import java.util.List;
import java.util.Optional;

public interface ISerieservice {
    Optional<Serie> findSerieById(Integer id);
    List<Serie> findAll();
    void saveSerie(Serie serie);
}
