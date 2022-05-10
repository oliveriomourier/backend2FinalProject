package com.example.catalog.controller;

import com.example.catalog.model.Catalog;
import com.example.catalog.service.impl.catalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catalog")
public class catalogController {
    catalogService catalogService;

    @Autowired
    public catalogController(com.example.catalog.service.impl.catalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("/{genre}")
    public Catalog findCatalogByGenre(@PathVariable String genre){
        return catalogService.findCatalogByGenre(genre);
    }
}
