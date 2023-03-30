package com.example.fujiokanetflix.service;

import com.example.fujiokanetflix.model.Serie;
import com.example.fujiokanetflix.repository.SerieRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class SerieService {

    @Autowired
    private SerieRepository repository;

    public Serie salvar(Serie serie){
        return repository.save(serie);
    }

    public List<Serie> listar(){
        return repository.findAll();
    }

    public Serie alterar(Serie serie){
        if (Objects.nonNull(serie.getId())){
            serie = repository.save(serie);
        }else {
            throw new NotFoundException();
        }
        return serie;
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

    public Serie consultarPorId(Integer id){
        return repository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }
}
