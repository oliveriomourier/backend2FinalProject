package com.example.seriesservice.model;

import lombok.*;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer number;
    private String urlstream;

    @ManyToOne
    @JoinColumn(name = "season_id")
    private Season season;
}
