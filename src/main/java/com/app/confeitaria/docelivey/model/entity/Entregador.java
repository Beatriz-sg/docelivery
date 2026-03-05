package com.app.confeitaria.docelivey.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ENTREGADOR")
public class Entregador extends Usuario {

    @Column(nullable = false, length = 11)
    private String cnh;
    @Column(nullable = false, length = 8)
    private String placaVeiculo;
    @Column(nullable = true, length = 20)
    private String veiculo;
}
