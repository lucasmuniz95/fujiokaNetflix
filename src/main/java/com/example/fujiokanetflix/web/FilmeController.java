package com.example.fujiokanetflix.web;

import com.example.fujiokanetflix.model.Filme;
import com.example.fujiokanetflix.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeController {


    @Autowired
    private FilmeService service;

    @PostMapping
    public ResponseEntity<Filme> salvar(@RequestBody Filme filme){
        filme = service.salvar(filme);
        return ResponseEntity.ok(filme);
    }

    @PutMapping
    public ResponseEntity<Filme> alterar(@RequestBody Filme filme){
        filme = service.alterar(filme);
        return ResponseEntity.ok(filme);
    }
    @GetMapping
    public ResponseEntity<List<Filme>> listar(Filme filme){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> consultar(@PathVariable("id") Integer id){
        return ResponseEntity.ok(service. consultarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Filme> deletar(@PathVariable("id") Integer id){
        if(service.excluir(id)){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
