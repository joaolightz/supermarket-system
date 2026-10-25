package com.joaolightz.supermarket.model;

public interface GerenciaFuncionarios {
    public Funcionario contrataSupervisor();
    public Funcionario contrataOperador();
    public Funcionario contrataRepositor();
    public Funcionario contrataFaxineiro();
}
