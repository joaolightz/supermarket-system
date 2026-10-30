package com.joaolightz.supermarket.interfaces;

import com.joaolightz.supermarket.model.Funcionario;
import com.joaolightz.supermarket.model.Supervisor;

public interface GerenciaFuncionarios {
    public Supervisor contrataSupervisor(String nome, String senha);
    public Funcionario contrataOperador(String nome);
    public Funcionario contrataRepositor(String nome);
}
