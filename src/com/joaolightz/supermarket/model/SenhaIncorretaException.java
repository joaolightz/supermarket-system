package com.joaolightz.supermarket.model;

public class SenhaIncorretaException extends RuntimeException {
    public SenhaIncorretaException() {
        super("Erro ao autenticar: Senha incorreta");
    }
}
