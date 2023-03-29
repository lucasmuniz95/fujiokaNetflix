package com.example.fujiokanetflix.repository;

import com.example.fujiokanetflix.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer> {
}
