package com.joaolightz.supermarket.model;

public class NaoAutenticadoException extends RuntimeException {
    public NaoAutenticadoException() {
        super("Funcionario nao autenticado no sistema");
    }
}
