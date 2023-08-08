package view;

import model.Cliente;
import repositorio.ClienteRepositorio;

import java.util.List;
import java.util.Scanner;

public class ClienteUI {

    public Cliente lerDados() {

        Scanner entrada = new Scanner(System.in);

        Cliente cliente = new Cliente();

        System.out.print("Nome: ");
        cliente.setNome(entrada.nextLine());

        System.out.print("Endereço: ");
        cliente.setEndereco(entrada.nextLine());

        System.out.print("Telefone: ");
        cliente.setTelefone(entrada.nextLine());

        System.out.print("E-mail: ");
        cliente.setEmail(entrada.nextLine());

        System.out.print("CPF: ");
        cliente.setCpf(entrada.nextLine());

        return cliente;
    }

    public void listar(List<Cliente> clientes, boolean listarDependentes){
        System.out.println(" - - - - - - - - ");
        System.out.println("***Lista de Clientes***");
        for(int i=0;i<clientes.size();i++){
            Cliente cliente = clientes.get(i);
            System.out.println("Nome:"+cliente.getNome());
            System.out.println("Endereço:"+cliente.getEndereco());
            System.out.println("Telefone:"+cliente.getTelefone());
            System.out.println("E-mail:"+cliente.getEmail());
            System.out.println("CPF:"+cliente.getCpf());

            if (listarDependentes) {
                System.out.println("Dependentes:");
                DependenteUI dependenteUI = new DependenteUI();
                dependenteUI.listar(cliente.getDependentes());
            }

            // Don't print at the end
            if (i != clientes.size() - 1){
                System.out.println(" - - ");
            }
        }

        System.out.println(" - - - - - - - - ");
    }

    public Cliente selecionarCliente () {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Selecione o ID de um cliente para cadastrar um novo dependente:");

        for (int i = 0; i < ClienteRepositorio.listar().size(); i++) {
            System.out.println("ID: " + i + " - " + ClienteRepositorio.listar().get(i).getNome());
        }

        int id = entrada.nextInt();
        return ClienteRepositorio.listar().get(id);
    }
}
