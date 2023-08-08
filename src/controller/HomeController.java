package controller;

import java.util.Scanner;

public class HomeController {

    public void executar() {

        ClienteController clienteController = new ClienteController();
        DependentesController dependentesController = new DependentesController();

        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("***Menu Principal***");

            System.out.println("1:Cadastrar Cliente");
            System.out.println("2:Listar Clientes");
            System.out.println("3:Adicionar dependentes");
            System.out.println("4:Listar Clientes e seus dependentes");
            System.out.println("9:Sair");
            System.out.print("Selecione opção:");

            // int opcao = Integer.parseInt(entrada.nextLine());
            // Try parse
            int opcao;
            try {
                opcao = Integer.parseInt(entrada.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.println("** Erro: " + e.getMessage());
                continue;
            }

            try {
                if (opcao == 1) {
                    clienteController.cadastrar();
                } else if (opcao == 2) {
                    clienteController.listar();
                } else if (opcao == 3) {
                    dependentesController.cadastrar();
                } else if (opcao == 4) {
                    clienteController.listarComDependentes();
                } else if (opcao == 9) {
                    break;
                } else {
                    System.out.println("Opção inválida");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("");
                System.out.println("** Erro: " + e.getMessage());
            }
        }
    }
}
