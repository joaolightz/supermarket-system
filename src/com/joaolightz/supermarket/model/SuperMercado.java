package com.joaolightz.supermarket.model;

public class SuperMercado {
    private String nome;
    private String cnpj;

    public SuperMercado(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Gerente contrataGerente(String nome, String senha) {
        if(nome == null || senha == null) {
            throw new NullPointerException("Argumento nulo especificado");
        }
        return new Gerente(nome, senha);
    }
}
