package com.example.catalog.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter @Setter
public class SerieDTO {
    private Integer id;
    private String name;
    private String genre;
}
