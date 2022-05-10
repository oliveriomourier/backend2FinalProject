package com.example.catalog.repository.feign;

import com.example.catalog.model.SerieDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "serie-service")
public interface serieRepository {

    @GetMapping("serie/genero/{genre}")
    List<SerieDTO> findSerieByGenre(@PathVariable String genre);
}
