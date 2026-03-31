package com.app.confeitaria.docelivery.auth;

import com.app.confeitaria.docelivery.model.enums.TipoUsuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Classe responsável pelo cadastro do Usúario (ADMIN, CLIENTE, CONFEITIRO, ENTREGADOR)

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    private String nome;
    private String email;
    private String password;
    private TipoUsuario tipoUsuario;
}
