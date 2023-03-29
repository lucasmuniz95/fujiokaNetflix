package com.example.fujiokanetflix.service;

import com.example.fujiokanetflix.model.Filme;
import com.example.fujiokanetflix.model.Genero;
import com.example.fujiokanetflix.repository.GeneroRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.ietf.jgss.GSSName;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class GeneroService {

    @Autowired
    public GeneroRepository repository;

    public Genero salvar(Genero genero){
        return repository.save(genero);
    }

    public List<Genero> listar(){
        return repository.findAll();
    }

    public Genero alterar(Genero genero){
        if (Objects.nonNull(genero.getId())){
            genero = repository.save(genero);
        }else {
            throw new NotFoundException();
        }
        return genero;
    }

    public Boolean excluir(Integer id){
        try{
            repository.deleteById(id);
        }
        catch (Exception e){
            log.info("Erro ao realizar a exclusao : {}", e);
            return false;
        }
        return true;
    }

    public Genero consultarPorId(Integer id){
        return repository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }
}
