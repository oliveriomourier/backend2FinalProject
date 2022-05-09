package com.example.catalog.controller;

import com.example.catalog.model.MovieDTO;
import com.example.catalog.service.catalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;

@RestController
@RequestMapping("/catalog")
public class catalogController {
    catalogService catalogService;

    @Autowired
    public catalogController(com.example.catalog.service.catalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("/findMovie/{id}")
    public MovieDTO findMovie(@PathVariable Integer id){
        MovieDTO movie = catalogService.findMovieById(id);
        return movie;
    }
}
