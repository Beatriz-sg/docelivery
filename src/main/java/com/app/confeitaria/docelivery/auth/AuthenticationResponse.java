package com.app.confeitaria.docelivery.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

// Classe responsável em geral a resposta para o cliente, ou seja, retornrá o "token"
@Getter
@AllArgsConstructor
public class AuthenticationResponse {

    @JsonProperty("access_token")
    private final String accessToken;

    @JsonProperty("refresh_token")
    private final String refreshToken;
}
