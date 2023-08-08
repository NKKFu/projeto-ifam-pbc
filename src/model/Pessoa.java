package model;

import javalidator.utils.JaValidator;
import utils.ValidacaoCPF;
import utils.ValidacaoEmail;
import utils.ValidacaoEndereco;
import utils.ValidacaoNome;
import utils.ValidacaoTelefone;

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
        JaValidator.validate(new ValidacaoNome(), telefone);
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        JaValidator.validate(new ValidacaoEndereco(), telefone);
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        JaValidator.validate(new ValidacaoTelefone(), telefone);
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        JaValidator.validate(new ValidacaoEmail(), email);
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        JaValidator.validate(new ValidacaoCPF(), cpf);
        this.cpf = cpf;
    }
}
