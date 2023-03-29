package com.example.fujiokanetflix.web;


import com.example.fujiokanetflix.model.Genero;
import com.example.fujiokanetflix.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genero")
public class GeneroController {


    @Autowired
    private GeneroService service;

    @PostMapping
    public ResponseEntity<Genero> salvar(@RequestBody Genero genero) {
        genero = service.salvar(genero);
        return ResponseEntity.ok(genero);
    }

    @PutMapping
    public ResponseEntity<Genero> alterar(@RequestBody Genero genero) {
        genero = service.alterar(genero);
        return ResponseEntity.ok(genero);
    }

    @GetMapping
    public ResponseEntity<List<Genero>> listar(Genero genero) {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genero> consultar(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(service.consultarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Genero> deletar(@PathVariable("id") Integer id) {
        if (service.excluir(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }


    }
}
