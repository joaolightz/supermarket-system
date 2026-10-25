package com.joaolightz.supermarket.model;

public class Gerente extends FuncionarioManager implements GerenciaFuncionarios {

    public Gerente(String nome) {
        super(nome);
    }

/*
    public Produto registraProduto(String produtonome) {

    }
*/

    @Override
    public Funcionario contrataSupervisor(String nome) {
        return new Supervisor(nome);
    }

    @Override
    public Funcionario contrataOperador(String nome) {
        return new OperadorDeCaixa(nome);
    }

    @Override
    public Funcionario contrataRepositor(String nome) {
        return new Repositor(nome);
    }

    @Override
    public Funcionario contrataFaxineiro(String nome) {
        return new Faxineiro(nome);
    }
}
