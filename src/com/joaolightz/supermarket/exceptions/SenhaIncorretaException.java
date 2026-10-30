package com.joaolightz.supermarket.exceptions;

public class SenhaIncorretaException extends RuntimeException {
    public SenhaIncorretaException() {
        super("Erro ao autenticar: Senha incorreta");
    }
}
