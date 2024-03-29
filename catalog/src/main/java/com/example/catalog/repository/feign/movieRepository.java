package com.example.catalog.repository.feign;

import com.example.catalog.model.MovieDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "movie-service")
public interface movieRepository {

    @GetMapping("/movie/findByGenre/{genre}")
    List<MovieDTO> findByGenre(@PathVariable String genre);
}
