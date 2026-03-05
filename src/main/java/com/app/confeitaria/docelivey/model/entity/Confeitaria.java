package com.app.confeitaria.docelivey.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CONFEITARIA")
public class Confeitaria extends Usuario {

    @Column(nullable = true, length = 20)
    private String cnpj;
    @Column(nullable = false, length = 100)
    private String nomeLoja;
    @Column(nullable = false, length = 100)
    private String proprietario;
    @Column(nullable = true, length = 20)
    private String categoria;
    @Column(nullable = true, length = 20)
    private String promocao;
}
