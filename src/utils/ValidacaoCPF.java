package utils;

import javalidator.interfaces.IValidation;

public class ValidacaoCPF implements IValidation<String> {

    @Override
    public void validate(String cpf) throws IllegalArgumentException {
        boolean isValid = cpf.matches("[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}-?[0-9]{2}");
        if (!isValid) {
            throw new IllegalArgumentException("CPF inválido");
        }
    }
}
