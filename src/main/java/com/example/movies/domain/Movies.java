package com.example.movies.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "movies")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "releaseYear")
    private Integer releaseYear;

    @Column(name = "genre")
    private String genre;

    @Column(name = "director")
    private String director;


}
