package com.app.confeitaria.docelivery.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("ENTREGADOR")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Entregador extends Usuario {

    @Column(nullable = false, length = 11)
    private String cnh;
    @Column(nullable = false, length = 8)
    private String placaVeiculo;
    @Column(nullable = true, length = 20)
    private String veiculo;
}
