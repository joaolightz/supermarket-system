package com.joaolightz.supermarket.model;

public abstract class FuncionarioManager extends Funcionario {
    private String senha;
    private boolean autenticado = false;

    FuncionarioManager(String nome, String senha) {
        super(nome);
        this.senha = senha;
    }

    public boolean autentica(String senha) {
        if(this.senha.equals(senha)) {
            System.out.println(this.getNome() + " - Autenticado no Sistema");
            autenticado = true;
            return true;
        }
        return false;
    }

    public boolean getAutenticado() {
        return autenticado;
    }

    public boolean temPermissaoParaAlterar() {
        return true;
    }
}
