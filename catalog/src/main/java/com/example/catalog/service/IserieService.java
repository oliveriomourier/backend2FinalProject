package com.example.catalog.service;

import com.example.catalog.model.SerieDTO;

import java.util.List;

public interface IserieService {
    List<SerieDTO> findSerieByGenre(String genre);
}
