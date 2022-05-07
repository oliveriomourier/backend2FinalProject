package com.example.seriesservice.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer seasonNumber;

    @OneToMany(mappedBy = "season")
    private List<Chapter> chapters;

    @ManyToOne
    @JoinColumn(name = "serie_id")
    private Serie serie;
}
