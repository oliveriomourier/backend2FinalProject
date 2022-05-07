package com.example.seriesservice.repository;

import com.example.seriesservice.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface serieRepository extends JpaRepository<Serie, Integer> {
}
