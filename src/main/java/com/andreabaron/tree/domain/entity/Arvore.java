package com.andreabaron.tree.domain.entity;


import com.andreabaron.tree.domain.models.ArvoreDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "arvore")
@Data
@NoArgsConstructor
public class Arvore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_arvore")
    private Integer id;

    @Column(name = "nome")
    private String name;

    @Column(name = "type_arvore")
    private String typeArvore;

    public Arvore(ArvoreDTO arvoreDTO) {
        this.name = arvoreDTO.getName();
        this.typeArvore = arvoreDTO.getTypeArvore();
    }

}
