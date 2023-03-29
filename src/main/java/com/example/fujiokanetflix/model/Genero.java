package com.example.fujiokanetflix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
