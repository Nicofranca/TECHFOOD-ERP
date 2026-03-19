package org.example.infra.view;

import java.util.Scanner;

public class MainView {

    Scanner scanner = new Scanner(System.in);

    public MainView() {
    }

    public int menuInicial(){

        int opcao;
        System.out.println("\n - TECHFOOD ERP - MENU PRINCIPAL -");
        System.out.println("1 - Gerenciar Funcionários(Ver/Contratar/Demitir/Editar)");
        System.out.println("2 - Pagamentos e Aumento Salarial");
        System.out.println("3 - Gerenciar Cardápio (Ver/Cadastrar/Excluir/Editar)");
        System.out.println("4 - Gerenciar Estoque (Entrada/Visualizar)");
        System.out.println("5 - REALIZAR VENDA (Presencial ou Delivery)");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
        opcao = scanner.nextInt();
        scanner.nextLine();

        return opcao;
    }


}
