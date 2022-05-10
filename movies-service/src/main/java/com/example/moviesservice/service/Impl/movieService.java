package com.example.moviesservice.service.Impl;

import com.example.moviesservice.model.Movie;
import com.example.moviesservice.repository.movieRepository;
import com.example.moviesservice.service.ImovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class movieService implements ImovieService {
    private movieRepository movieRepository;

    @Autowired
    public movieService(com.example.moviesservice.repository.movieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Optional<Movie> findMovieById(Integer id){
        return movieRepository.findById(id);
    }
    @Override
    public List<Movie> findAllMovies(){
        return movieRepository.findAll();
    }

    @Override
    public void saveMovie(Movie movie){
        movieRepository.save(movie);
    }

    @Override
    public List<Movie> findMovieByGenre(String genre){
        return movieRepository.findByGenre(genre);
    }
}
