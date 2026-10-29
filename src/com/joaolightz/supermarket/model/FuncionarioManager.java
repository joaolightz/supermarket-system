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
        } else if (getAutenticado()) {
            autenticado = false;
            throw new SecurityException("Senha incorreta, autenticacao revogada");
        } else {
            autenticado = false;
            throw new SenhaIncorretaException();
        }
    }

    public boolean getAutenticado() {
        return autenticado;
    }

    public boolean temPermissaoParaAlterarMeta() {
        if(this.getAutenticado()) {
            return true;
        } else {
            throw new NaoAutenticadoException();
        }
    }
}
