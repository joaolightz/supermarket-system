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

    public Gerente contrataGerente(SuperMercado solicitante, String nome, String senha) {
        if(solicitante == null || nome == null || senha == null) {
            throw new NullPointerException("Argumento nulo especificado");
        }
        return new Gerente(nome, senha);
    }
}
