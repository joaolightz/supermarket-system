package com.joaolightz.supermarket.model;

public abstract class FuncionarioManager extends Funcionario implements Autenticavel {
    private String senha;

    FuncionarioManager(String nome) {
        super(nome);
    }

    @Override
    public boolean autentica(String senha) {
        return this.senha.equals(senha);
    }
}
