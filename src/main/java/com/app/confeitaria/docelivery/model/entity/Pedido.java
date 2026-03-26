package com.app.confeitaria.docelivery.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Informa que o padrão utilizado é uma tabela para todos os usuários
@DiscriminatorColumn(name = "tipo_usuario", discriminatorType = DiscriminatorType.STRING) // Informa qual é o nome da coluna que vai ser utilizada
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include

    private Long id;
    @Column(nullable = false, length = 10)
    private String numeroPedido;
    @Column(nullable = false)
    private double valorPedido;
    @Column(nullable = false)
    private LocalDateTime dataHoraPedido;
    @Column(nullable = true)
    private LocalDateTime dataHoraEntrega;
    @Column(nullable = false, length = 20)
    private String status;
    private boolean codStatus;

    // Relacionamento entre as classes

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id", referencedColumnName = "id",nullable = false)
    private Cliente cliente;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "confeiteiro_id", referencedColumnName = "id", nullable = false)
    private Entregador confeiteiro;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "entregador_id", referencedColumnName = "id", nullable = false)
    private Entregador entregador;

}
