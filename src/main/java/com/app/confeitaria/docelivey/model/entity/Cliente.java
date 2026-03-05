package com.app.confeitaria.docelivey.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CLIENTE")
public class Cliente extends Usuario {

    @Column(nullable = true, length = 20)
    private String apelido;
}
