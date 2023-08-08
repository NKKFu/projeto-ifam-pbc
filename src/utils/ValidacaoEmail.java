package utils;

import javalidator.interfaces.IValidation;

public class ValidacaoEmail implements IValidation<String> {

    @Override
    public void validate(String email) throws IllegalArgumentException {
        boolean isValid = email.matches("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}");
        if (!isValid) {
            throw new IllegalArgumentException("Email inválido");
        }
    }
}
