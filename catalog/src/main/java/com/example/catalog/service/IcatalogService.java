package com.example.catalog.service;

import com.example.catalog.model.Catalog;
import com.example.catalog.model.MovieDTO;

import java.util.List;

public interface IcatalogService {
    Catalog findByGenre(String genre);
}
