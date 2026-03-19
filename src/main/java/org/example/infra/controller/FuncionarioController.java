package org.example.infra.controller;

import org.example.infra.view.FuncionarioView;
import org.example.model.service.FuncionarioService;

public class FuncionarioController {

    private FuncionarioView funcionarioView;
    private FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioView funcionarioView, FuncionarioService funcionarioService) {
        this.funcionarioView = funcionarioView;
        this.funcionarioService = funcionarioService;
    }

    public void gerenciarFuncionario(){
        int escolha = -1;

        do {
            escolha = funcionarioView.menuFuncionario();

            switch (escolha){
                case 1 -> funcionarioService.listarFuncionarios();

                case 2 -> funcionarioService.contratarFuncionario(
                        funcionarioView.contratarFuncionario());

                case 3 -> funcionarioService.demitirFuncionario(funcionarioView.demitirFuncionario());

                case 4 -> funcionarioService.editarFuncionario(funcionarioView.editarFuncionario());
            }
        } while (escolha!=0);
    }
}
