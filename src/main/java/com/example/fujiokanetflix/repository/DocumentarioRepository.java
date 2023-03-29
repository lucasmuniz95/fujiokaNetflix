package com.example.fujiokanetflix.repository;

import com.example.fujiokanetflix.model.Documentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentarioRepository extends JpaRepository<Documentario, Integer> {

}
