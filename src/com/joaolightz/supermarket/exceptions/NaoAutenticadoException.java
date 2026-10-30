package com.joaolightz.supermarket.exceptions;

public class NaoAutenticadoException extends RuntimeException {
    public NaoAutenticadoException() {
        super("Funcionario nao autenticado no sistema");
    }
}
