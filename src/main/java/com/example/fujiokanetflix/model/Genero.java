package com.example.fujiokanetflix.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_genero")
public class Genero {
    @Id
    @GeneratedValue
    private long id;
    private String titulo;

}
