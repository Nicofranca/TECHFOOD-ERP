package org.example.service;

import org.example.model.domain.Funcionario;
import org.example.model.service.FuncionarioService;

import java.util.List;

public class FuncionarioServiceImpl implements FuncionarioService {
    @Override
    public List<Funcionario> listarFuncionarios() {
        return List.of();
    }

    @Override
    public Funcionario contratarFuncionario(int id, String nome, String cargo, Double salario) {
        return null;
    }

    @Override
    public void demitirFuncionario(int id) {

    }

    @Override
    public Funcionario editarFuncionario(String nome, String cargo, Double salario) {
        return null;
    }
}
