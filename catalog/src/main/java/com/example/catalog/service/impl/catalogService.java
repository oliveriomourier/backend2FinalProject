package com.example.catalog.service.impl;

import com.example.catalog.model.Catalog;
import com.example.catalog.model.MovieDTO;
import com.example.catalog.model.SerieDTO;
import com.example.catalog.service.IcatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class catalogService implements IcatalogService {
    private movieService movieService;
    private serieService serieService;

    @Autowired
    public catalogService(movieService movieService, serieService serieService) {
        this.movieService = movieService;
        this.serieService = serieService;
    }

    @Override
    public Catalog findCatalogByGenre(String genre){
        Catalog catalog = new Catalog();
        List<MovieDTO> movies = movieService.findMovieByGenre(genre);
        List<SerieDTO> series = serieService.findSerieByGenre(genre);
        catalog.setGenre(genre);
        catalog.setMovies(movies);
        catalog.setSeries(series);

        return catalog;
    }
}
