package controller;

import model.Cliente;
import view.ClienteUI;
import view.DependenteUI;

public class DependentesController {

    private DependenteUI dependenteUI = new DependenteUI();

    public void cadastrar() {
        ClienteUI clienteUI = new ClienteUI();
        Cliente cliente = clienteUI.selecionarCliente();
        dependenteUI.cadastrar(cliente);
    }
}
