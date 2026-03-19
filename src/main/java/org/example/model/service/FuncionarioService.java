package org.example.model.service;

import org.example.model.domain.Funcionario;

import java.util.List;

public interface FuncionarioService {
    List<Funcionario> listarFuncionarios();

    //Como não tem banco, o gerente irá colocar o id manualmente
    Funcionario contratarFuncionario(Funcionario funcionario);

    void demitirFuncionario(int id);

    Funcionario editarFuncionario(String nome, String cargo, Double salario);
}
