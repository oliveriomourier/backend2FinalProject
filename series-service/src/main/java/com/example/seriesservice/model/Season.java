package com.example.seriesservice.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter @Data
@AllArgsConstructor
@NoArgsConstructor
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer seasonNumber;

    @OneToMany()
    @JoinColumn(name = "id")
    private List<Chapter> chapterList;
}
