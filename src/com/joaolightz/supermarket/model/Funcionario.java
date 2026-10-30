package com.joaolightz.supermarket.model;

public abstract class Funcionario {
    private String nome;
    private double salario;
    private double meta;

    Funcionario(String nome) {
        if(nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome Invalido de Funcionario!");
        }
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome + "\nSalario: " + salario + "\nMeta: " + meta;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getMeta() {
        return meta;
    }

    public void setSalario(Gerente solicitante, Funcionario funcionario, double salario) {
        if(funcionario == null || solicitante == null) {
            throw new NullPointerException("Argumento nulo especificado");
        }
        if(!solicitante.temPermissaoParaAlterarSalario()) {
            throw new SecurityException("Sem permissao para alterar o Salario de um Funcionario");
        }
        if(salario <= 0) {
            throw new IllegalArgumentException("Salario invalido: " + salario);
        }
        funcionario.salario = salario;
    }

    public void setMeta(FuncionarioManager solicitante, Funcionario funcionario, int meta) {
        if(funcionario == null || solicitante == null) {
            throw new NullPointerException("Argumento nulo especificado");
        }
        if(!solicitante.temPermissaoParaAlterarMeta()) {
            throw new SecurityException("Sem permissao para alterar a Meta de um Funcionario.");
        }
        if(meta <= 0) {
            throw new IllegalArgumentException("Meta invalida: " + meta);
        }
        funcionario.meta = meta;
    }
}
