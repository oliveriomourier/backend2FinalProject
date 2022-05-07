package com.example.seriesservice.controller;

import com.example.seriesservice.model.Serie;
import com.example.seriesservice.service.impl.serieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/serie")
public class serieController {
    serieService serieService;

    @Autowired
    public serieController(serieService serieService) {
        this.serieService = serieService;
    }

    @GetMapping("/{id}")
    public Serie findById(@PathVariable Integer id){
        Optional<Serie> serie = serieService.findSerieById(id);
        return serie.get();
    }

    @GetMapping("/findAll")
    public List<Serie> findAll(){
        return serieService.findAll();
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveSerie(@RequestBody Serie serie){
        if (serie.getName() == null || serie.getName().isEmpty()){
            return new ResponseEntity<String>("Falta el nombre", HttpStatus.BAD_REQUEST);
        }else if (serie.getGenre() == null || serie.getGenre().isEmpty()){
            return new ResponseEntity<String>("Falta el genero", HttpStatus.BAD_REQUEST);
        }
        serieService.saveSerie(serie);
        return new ResponseEntity<String>("Se creo correctamente el codigo", HttpStatus.OK);
    }
}
