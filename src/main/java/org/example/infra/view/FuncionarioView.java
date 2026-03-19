package org.example.infra.view;

import org.example.model.domain.Funcionario;

import java.util.Scanner;

public class FuncionarioView {

    Scanner scanner = new Scanner(System.in);
    public Funcionario funcionario;

    public FuncionarioView(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int menuFuncionario(){
        System.out.println("1-Listar / 2-Contratar /3-Demitir / 4-Editar");
        int subOp = scanner.nextInt();
        scanner.nextLine();

        return subOp;
    }

    public Funcionario contratarFuncionario(){
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Salário: ");
        Double salario = scanner.nextDouble();

        System.out.println("Novo ID Funcionario: ");
        int id = scanner.nextInt();

        funcionario.setId(id);
        funcionario.setNome(nome);
        funcionario.setCargo(cargo);
        funcionario.setSalario(salario);

        return funcionario;
    }

    public int demitirFuncionario(){
        System.out.print("Informe o código para demitir:");
        int id = scanner.nextInt();

        return id;
    }

    public Funcionario editarFuncionario(){
        System.out.println("Insira o ID: ");
        int id = scanner.nextInt();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Salário: ");
        Double salario = scanner.nextDouble();

        funcionario.setId(id);
        funcionario.setNome(nome);
        funcionario.setCargo(cargo);
        funcionario.setSalario(salario);

        return funcionario;
    }
}
