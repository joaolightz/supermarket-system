package com.joaolightz.supermarket.model;

import com.joaolightz.supermarket.exceptions.NaoAutenticadoException;
import com.joaolightz.supermarket.interfaces.GerenciaFuncionarios;

public class Gerente extends FuncionarioManager implements GerenciaFuncionarios {

    public Gerente(String nome, String senha) {
        super(nome, senha);
    }

/*
    public Produto registraProduto(String produtonome) {

    }
*/

    @Override
    public Supervisor contrataSupervisor(String nome, String senha) {
        if(!this.getAutenticado()) throw new NaoAutenticadoException();

        return new Supervisor(nome, senha);
    }

    @Override
    public Funcionario contrataOperador(String nome) {
        if(!this.getAutenticado()) throw new NaoAutenticadoException();

        return new OperadorDeCaixa(nome);
    }

    @Override
    public Funcionario contrataRepositor(String nome) {
        if(!this.getAutenticado()) throw new NaoAutenticadoException();

        return new Repositor(nome);
    }

    public boolean temPermissaoParaAlterarSalario() {
        if(this.getAutenticado()) {
            return true;
        } else {
            throw new NaoAutenticadoException();
        }
    }
}
