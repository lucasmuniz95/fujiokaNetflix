package com.example.fujiokanetflix.web;

import com.example.fujiokanetflix.model.Documentario;
import com.example.fujiokanetflix.model.Filme;
import com.example.fujiokanetflix.repository.DocumentarioRepository;
import com.example.fujiokanetflix.service.DocumentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documentario")
public class DocumentarioController {

    @Autowired
    private DocumentarioService service;

    @PostMapping
    public ResponseEntity<Documentario> salvar(@RequestBody Documentario documentario){
        documentario = service.salvar(documentario);
        return ResponseEntity.ok(documentario);
    }

    @PutMapping
    public ResponseEntity<Documentario> alterar(@RequestBody Documentario documentario){
        documentario = service.alterar(documentario);
        return ResponseEntity.ok(documentario);
    }
    @GetMapping
    public ResponseEntity<List<Documentario>> listar(Documentario documentario){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Documentario> consultar(@PathVariable("id") Integer id){
        return ResponseEntity.ok(service.consultarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Documentario> deletar(@PathVariable("id") Integer id){
        if(service.excluir(id)){
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
