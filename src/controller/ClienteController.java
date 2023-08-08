package controller;

import model.Cliente;
import repositorio.ClienteRepositorio;
import view.ClienteUI;

public class ClienteController {

    private ClienteUI clienteUI = new ClienteUI();

    public void cadastrar() {
        Cliente cliente = clienteUI.lerDados();
        if (cliente != null) {
            ClienteRepositorio.salvar(cliente);
        }
    }

    public void listar() {
        clienteUI.listar(ClienteRepositorio.listar(), false);
    }

    public void listarComDependentes() {
        clienteUI.listar(ClienteRepositorio.listar(), true);
    }
}
