package org.example.infra.controller;

import org.example.infra.view.MainView;

public class MainController {

    private MainView mainView;
    private CardapioController cardapioController;
    private VendasController vendasController;
    private EstoqueController estoqueController;
    private ControleSalarioController controleSalarioController;
    private FuncionarioController funcionarioController;

    public MainController(MainView mainView, CardapioController cardapioController, VendasController vendasController, EstoqueController estoqueController, ControleSalarioController controleSalarioController, FuncionarioController funcionarioController) {
        this.mainView = mainView;
        this.cardapioController = cardapioController;
        this.vendasController = vendasController;
        this.estoqueController = estoqueController;
        this.controleSalarioController = controleSalarioController;
        this.funcionarioController = funcionarioController;
    }

    public MainController() {

    }


    public void iniciar(){

        int escolha = -1;

        do {
            escolha = mainView.menuInicial();

            switch (escolha){
                case 1 -> funcionarioController.gerenciarFuncionario();
            }
        }while (escolha!=0);
    }

}

