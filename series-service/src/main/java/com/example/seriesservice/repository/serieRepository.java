package com.example.seriesservice.repository;

import com.example.seriesservice.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface serieRepository extends JpaRepository<Serie, Integer> {
}
