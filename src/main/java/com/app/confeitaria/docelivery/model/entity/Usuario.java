package com.app.confeitaria.docelivery.model.entity;

import com.app.confeitaria.docelivery.model.enums.TipoUsuario;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Informa que o padrão utilizado é uma tabela para todos os usuários
@DiscriminatorColumn(name = "tipo_usuario", discriminatorType = DiscriminatorType.STRING) // Informa qual é o nome da coluna que vai ser utilizada
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {

    @Id       //  PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //  Auto-Incremento (identificado sequencialmente de 1 em 1)
    @EqualsAndHashCode.Include
    private Long id;
    @Column(nullable = true, length = 100)
    private String nome;
    @Column(nullable = true, length = 20)
    private String cpf;
    @Column(nullable = true, length = 10)
    private String cep;
    @Column(nullable = true, length = 100)
    private String endereco;
    @Column(nullable = true, length = 50)
    private String bairro;
    @Column(nullable = true, length = 20)
    private String cidade;
    @Column(nullable = true, length = 2)
    private String uf;
    @Column(nullable = true, length = 20)
    private String telefone;
    @Column(nullable = false, length = 45)
    private String email;
    @Column(nullable = false, length = 250)
    private String senha;
    @Column(nullable = true)
    private LocalDate dataNascimento;

    @Column(name = "tipo_usuario", insertable = false, updatable = false)
    private TipoUsuario tipoUsuario;

    private Boolean codStatus;


}
