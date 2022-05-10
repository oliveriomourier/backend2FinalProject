package com.example.seriesservice.repository;

import com.example.seriesservice.model.Season;
import com.example.seriesservice.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface serieRepository extends JpaRepository<Serie, Integer> {

    @Query("SELECT s FROM Serie s WHERE s.genre = :genre")
    List<Serie> findSerieByGenre(String genre);
}
