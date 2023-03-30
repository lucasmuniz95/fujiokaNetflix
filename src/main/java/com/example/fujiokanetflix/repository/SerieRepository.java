package com.example.fujiokanetflix.repository;

import com.example.fujiokanetflix.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Integer> {
}
