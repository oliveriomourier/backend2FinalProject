package com.example.moviesservice.repository;

import com.example.moviesservice.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface movieRepository extends JpaRepository<Movie, Integer> {
}
