package com.example.catalog.service;

import com.example.catalog.model.Catalog;

public interface IcatalogService {
    Catalog findCatalogByGenre(String genre);
}
