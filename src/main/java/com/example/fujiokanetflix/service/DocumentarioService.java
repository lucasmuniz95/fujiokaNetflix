package com.example.fujiokanetflix.service;

import com.example.fujiokanetflix.service.DocumentarioService;
import com.example.fujiokanetflix.model.Documentario;
import com.example.fujiokanetflix.repository.DocumentarioRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class DocumentarioService {

    @Autowired
    private DocumentarioRepository repository;

    public Documentario salvar(Documentario doc) {
        return repository.save(doc);
    }

    public Documentario alterar(Documentario doc) {
        if (Objects.nonNull(doc.getId())) {
            doc = repository.save(doc);
        } else {
            throw new NotFoundException();
        }
        return doc;
    }

    public List<Documentario> listar() {
        return repository.findAll();
    }

    public Boolean excluir(Integer id) {
        try {
            repository.deleteById(id);
        } catch (Exception e) {
            log.info("Erro ao realizar a exclusao : {}", e);
            return false;
        }
        return true;
    }

    public Documentario consultarPorId(Integer id){
        return repository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }
}
