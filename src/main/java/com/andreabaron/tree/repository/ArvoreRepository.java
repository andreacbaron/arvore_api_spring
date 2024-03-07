package com.andreabaron.tree.repository;

import com.andreabaron.tree.domain.entity.Arvore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArvoreRepository extends JpaRepository<Arvore, Integer> {
}
