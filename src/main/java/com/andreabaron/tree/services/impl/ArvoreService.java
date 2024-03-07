package com.andreabaron.tree.services.impl;

import com.andreabaron.tree.domain.entity.Arvore;
import com.andreabaron.tree.domain.models.ArvoreDTO;
import com.andreabaron.tree.repository.ArvoreRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;
import java.util.Optional;

@Service
public class ArvoreService {


    @Autowired
    private ArvoreRepository arvoreRepository;

    @Transactional
    public Arvore createArvore(ArvoreDTO arvoreDTO) {
        Arvore convertedDTOToArvore = new Arvore(arvoreDTO);
        return this.arvoreRepository.save(convertedDTOToArvore);
    }

    public Optional<Arvore> getById(Integer id) {
        return this.arvoreRepository.findById(id);
    }

    public List<Arvore> getAll() {
        return this.arvoreRepository.findAll();
    }
}
