package com.joaolightz.supermarket.model;

public class Produto {
    private String produto;
    private double preco;
    private int quantidade;

    Produto(String nome) {
        produto = nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getEstado() {
        if (quantidade <= 0) return "Indisponivel";
        else if (quantidade <= 50) return "Muito baixo";
        else if (quantidade <= 100) return "Baixo";
        else if (quantidade <= 250) return "OK";
        else return "Alto";
    }
}
