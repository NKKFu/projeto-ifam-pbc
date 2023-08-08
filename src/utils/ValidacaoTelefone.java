package utils;

import javalidator.interfaces.IValidation;

public class ValidacaoTelefone implements IValidation<String> {

    @Override
    public void validate(String telefone) throws IllegalArgumentException {
        boolean isValid = telefone.matches("(\\+)?[0-9\\s]+");
        if (!isValid) {
            throw new IllegalArgumentException("Telefone inválido");
        }
    }
}
