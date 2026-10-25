package com.joaolightz.supermarket.model;

public class Produto {
    private String produto;
    private double preco;
    private int quantidade;
    private String estado;

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
        String estado = "Indisponivel";
        if(quantidade <= 50) estado = "Muito baixo";
        else if (quantidade <= 100) estado = "Baixo";
        else if (quantidade <= 250) estado = "OK";
        return estado;
    }
}
