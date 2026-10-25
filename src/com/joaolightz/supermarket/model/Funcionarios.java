package com.joaolightz.supermarket.model;

public abstract class Funcionarios {
    private String nome;
    private double salario;
    private double meta;
    private int idade;

    Funcionarios(String nome) {
        this.nome = nome;
    }
}
