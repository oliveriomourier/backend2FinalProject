package com.example.moviesservice.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data @Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String genre;
    private String urlstream;
}
