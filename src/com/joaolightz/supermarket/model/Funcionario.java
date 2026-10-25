package com.joaolightz.supermarket.model;

public abstract class Funcionario {
    private String nome;
    private double salario;
    private double meta;

    Funcionario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome + "\nSalario: " + salario + "\nMeta: " + meta;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(Funcionario solicitante, Funcionario funcionario, double salario) {
        if(!(solicitante instanceof Gerente)) {
            throw new SecurityException("Voce nao tem permissao para alterar o salario de um Funcionario.");
        }
        if(salario <= 0) {
            throw new IllegalArgumentException("Salario invalido: " + salario);
        }
        funcionario.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setMeta(Funcionario solicitante, Funcionario funcionario, int meta) {
        if(!(solicitante instanceof FuncionarioManager)) {
            throw new SecurityException("Voce nao tem permissao para alterar a Meta de um Funcionario.");
        }
        if(meta <= 0) {
            throw new IllegalArgumentException("Meta invalida: " + meta);
        }
        funcionario.meta = meta;
    }

    public double getMeta() {
        return meta;
    }
}
