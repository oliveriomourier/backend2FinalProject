package com.example.seriesservice.controller;

import com.example.seriesservice.model.Serie;
import com.example.seriesservice.service.impl.serieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/serie")
public class serieController {
    serieService serieService;

    @Autowired
    public serieController(serieService serieService) {
        this.serieService = serieService;
    }

    @GetMapping("{id}")
    public Optional<Serie> findById(@PathVariable Integer id){
        return serieService.findSerieById(id);
    }
}
