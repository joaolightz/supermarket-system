package com.joaolightz.supermarket.model;

public class Gerente extends FuncionarioManager implements GerenciaFuncionarios {

    Gerente(String nome) {
        super(nome);
    }

    public Produto registraProduto(String produtonome) {

    }

    @Override
    public Funcionario contrataSupervisor() {

    }

    @Override
    public Funcionario contrataOperador() {

    }

    @Override
    public Funcionario contrataRepositor() {

    }

    @Override
    public Funcionario contrataFaxineiro() {

    }
}
