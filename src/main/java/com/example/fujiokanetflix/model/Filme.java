package com.example.fujiokanetflix.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_filme")
public class Filme implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String titulo;
    @Column(name = "ds_sinopse", length = 500)
    private String sinopse;

    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;

}
