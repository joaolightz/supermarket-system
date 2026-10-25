package com.joaolightz.supermarket.model;

public interface GerenciaFuncionarios {
    public Funcionario contrataSupervisor(String nome);
    public Funcionario contrataOperador(String nome);
    public Funcionario contrataRepositor(String nome);
    public Funcionario contrataFaxineiro(String nome);
}
