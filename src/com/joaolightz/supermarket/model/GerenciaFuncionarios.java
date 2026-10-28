package com.joaolightz.supermarket.model;

public interface GerenciaFuncionarios {
    public Supervisor contrataSupervisor(String nome, String senha);
    public Funcionario contrataOperador(String nome);
    public Funcionario contrataRepositor(String nome);
}
