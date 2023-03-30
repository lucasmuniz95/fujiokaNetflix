package com.example.fujiokanetflix.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Serie {

    @Id
    @GeneratedValue
    private long id;
    private int temporada;
    private String titulo;
    @Column(length = 500)
    private String sinopse;
}
