package com.example.moviesservice.controller;

import com.example.moviesservice.model.Movie;
import com.example.moviesservice.service.Impl.movieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movie")
public class movieController {
    movieService movieService;

    @Autowired
    public movieController(com.example.moviesservice.service.Impl.movieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/{id}")
    public Optional<Movie> findMovieById(@PathVariable Integer id){
        return movieService.findMovieById(id);
    }

    @GetMapping("/findAll")
    public List<Movie> findAllMovies(){
        return movieService.findAllMovies();
    }

    @GetMapping("/findByGenre/{genre}")
    public List<Movie> findByGenre(@PathVariable String genre,
                                   @RequestParam (defaultValue = "false") Boolean throwError){
        if(throwError){
            throw new RuntimeException();
        }
        return movieService.findMovieByGenre(genre);
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveMovie(@RequestBody Movie movie){
        if (movie.getName() == null || movie.getName().isEmpty()){
            return new ResponseEntity<String>("No se puede guardar la pelicula por falta de titulo", HttpStatus.BAD_REQUEST);
        }else if (movie.getGenre() == null || movie.getGenre().isEmpty()){
            return new ResponseEntity<String>("No se puede guardar la pelicula por falta de genero", HttpStatus.BAD_REQUEST);
        }else if (movie.getUrlstream() == null || movie.getUrlstream().isEmpty()){
            return new ResponseEntity<String>("No se puede guardar la pelicula por falta de url", HttpStatus.BAD_REQUEST);
        }else{
            movieService.saveMovie(movie);
        }
        return new ResponseEntity<String>("Producto guardado correctamente", HttpStatus.OK);
    }

}
