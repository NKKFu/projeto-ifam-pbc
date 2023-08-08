package model;

import utils.ValidacaoCPF;
import utils.ValidacaoEmail;

public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone, String email, String cpf) {
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmail(email);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!validarNome(nome)) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (!validarEndereco(endereco)) {
            throw new IllegalArgumentException("Endereço inválido");
        }
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (!validarTelefone(telefone)) {
            throw new IllegalArgumentException("Telefone inválido");
        }
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!ValidacaoEmail.validar(email)) {
            throw new IllegalArgumentException("E-mail inválido");
        }
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (!ValidacaoCPF.validar(cpf)) {
            throw new IllegalArgumentException("CPF inválido");
        }
        this.cpf = cpf;
    }

    // Validates if name contains only letters
    public boolean validarNome(String nome) {
        return nome.matches("[a-zA-Z\\s]+");
    }

    // Validates if phone number contains only numbers
    // Can contain + symbol
    // Can contain spaces
    public boolean validarTelefone(String telefone) {
        return telefone.matches("(\\+)?[0-9\\s]+");
    }

    // Validates if address is valid
    public boolean validarEndereco(String endereco) {
        return endereco.matches("[a-zA-Z0-9\\s]+");
    }
}
