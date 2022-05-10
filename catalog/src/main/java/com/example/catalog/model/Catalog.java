package com.example.catalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Catalog {
    private String genre;

    @Transient
    private List<MovieDTO> movies;
    @Transient
    private List<SerieDTO> series;
}
