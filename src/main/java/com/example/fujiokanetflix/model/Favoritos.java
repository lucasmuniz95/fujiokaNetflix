package com.example.fujiokanetflix.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
    @Entity
    @Getter
    @Setter
    public class Favoritos{

        @Id
        @GeneratedValue
        private int id;

        @ManyToOne
        private Usuario usuario;


    }
