package utils;

import javalidator.interfaces.IValidation;

public class ValidacaoNome implements IValidation<String> {

    @Override
    public void validate(String nome) throws IllegalArgumentException {
        boolean isValid = nome.matches("[a-zA-Z\\s]+");
        if (!isValid) {
            throw new IllegalArgumentException("Nome inválido");
        }
    }
}
