package com.example.catalog.repository.feign;

import com.example.catalog.model.MovieDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "movie-service")
public interface movieRepository {

    @GetMapping("movie/{id}")
    Optional<MovieDTO> findMovieById(@PathVariable Integer id);

    @GetMapping("movie/findByGenre/{genre}")
    List<MovieDTO> findByGenre(@PathVariable String genre);
}
