package com.andreabaron.tree.controllers;

import com.andreabaron.tree.domain.entity.Arvore;
import com.andreabaron.tree.domain.models.ArvoreDTO;
import com.andreabaron.tree.services.impl.ArvoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/arvore")
public class ArvoreController {

    @Autowired
    private ArvoreService arvoreService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Arvore create(@RequestBody ArvoreDTO arvoreDTO) {

        return this.arvoreService.createArvore(arvoreDTO);

    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Arvore getId(@PathVariable("id") Integer id) {
        return this.arvoreService.getById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "arvore não encotrando"));
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Arvore> getAll() {
        return this.arvoreService.getAll();

    }


}
