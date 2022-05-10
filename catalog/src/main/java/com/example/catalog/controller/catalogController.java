package com.example.catalog.controller;

import com.example.catalog.config.restTemplateConfig;
import com.example.catalog.model.Catalog;
import com.example.catalog.service.impl.catalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catalog")
public class catalogController {
    private catalogService catalogService;
    private restTemplateConfig restTemplateConfig;

    @Autowired
    public catalogController(catalogService catalogService, restTemplateConfig restTemplateConfig) {
        this.catalogService = catalogService;
        this.restTemplateConfig = restTemplateConfig;
    }

    @GetMapping("/{genre}")
    public Catalog findCatalogByGenre(@PathVariable String genre){
        return catalogService.findCatalogByGenre(genre);
    }


}
