package utils;

import javalidator.interfaces.IValidation;

public class ValidacaoEndereco implements IValidation<String> {

    @Override
    public void validate(String endereco) throws IllegalArgumentException {
        boolean isValid = endereco.matches("[a-zA-Z0-9\\s]+");
        if (!isValid) {
            throw new IllegalArgumentException("Endereço inválido");
        }
    }
}
