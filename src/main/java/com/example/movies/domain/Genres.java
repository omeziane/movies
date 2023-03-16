package com.example.movies.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "Genres")
public class Genres {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

}
