package org.example.service;

import org.example.model.domain.Funcionario;
import org.example.model.service.FuncionarioService;

import java.util.Arrays;
import java.util.List;

public class FuncionarioServiceImpl implements FuncionarioService {

    @Override
    public List<Funcionario> listarFuncionarios() {
        return List.of();
    }

    @Override
    public Funcionario contratarFuncionario(Funcionario funcionario) {

        if(funcionario == null){
            throw new RuntimeException("Os campos tem que ser preenchidos! ");
        }
        return funcionario;
    }

    @Override
    public void demitirFuncionario(int id) {

    }

    @Override
    public Funcionario editarFuncionario(String nome, String cargo, Double salario) {
        return null;
    }
}
