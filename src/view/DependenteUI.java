package view;

import model.Cliente;
import model.Dependente;
import model.RelacaoEnum;

import java.util.List;
import java.util.Scanner;

public class DependenteUI {
    public void cadastrar(Cliente cliente) {
        Dependente dependente = new Dependente();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do dependente:");
        dependente.setNome(entrada.nextLine());

        System.out.println("Digite o endereço do dependente:");
        dependente.setEndereco(entrada.nextLine());

        System.out.println("Digite o telefone do dependente:");
        dependente.setTelefone(entrada.nextLine());

        System.out.println("Digite o email do dependente:");
        dependente.setEmail(entrada.nextLine());

        System.out.println("Digite o cpf do dependente:");
        dependente.setCpf(entrada.nextLine());

        System.out.println(
                "Selecione o dígito correspondente da relação que o dependente possui com " + cliente.getNome() + ":");

        for (int i = 0; i < RelacaoEnum.values().length; i++) {
            System.out.println(i + ":" + RelacaoEnum.values()[i].toString());
        }

        int opcao = entrada.nextInt();
        cliente.addDependente(dependente, RelacaoEnum.values()[opcao]);
    }

    public void listar(List<Dependente> dependentes) {

        for (int i = 0; i < dependentes.size(); i++) {
            Dependente dependente = dependentes.get(i);

            System.out.println("\tDependente #" + i);
            System.out.println("\tNome:" + dependente.getNome());
            System.out.println("\tEndereço:" + dependente.getEndereco());
            System.out.println("\tTelefone:" + dependente.getTelefone());
            System.out.println("\tE-mail:" + dependente.getEmail());
            System.out.println("\tCPF:" + dependente.getCpf());
            System.out.println("\tRelação:" + dependente.getRelacao().toString());

            // Don't print at the end
            if (i != dependentes.size() - 1) {
                System.out.println("\t- - ");
            }
        }
    }
}
