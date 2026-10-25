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

    public Funcionarios contrataGerente(String nome) {
        Gerente gerente = new Gerente(nome);
        return gerente;
    }
}
