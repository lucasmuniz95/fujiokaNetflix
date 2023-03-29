package com.example.fujiokanetflix.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_filme")
public class Filme {
    @Id
    @GeneratedValue
    private int id;
    private String titulo;
    @Column(name = "ds_sinopse", length = 500)
    private String sinopse;

}
