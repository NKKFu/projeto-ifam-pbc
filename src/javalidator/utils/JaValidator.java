package javalidator.utils;

import javalidator.interfaces.IValidation;

// Validator class has a generic type T which is a class that impleents IValidation
public class JaValidator {
    public static <F> void validate(IValidation<F> validation, F field) {
        try {
            validation.validate(field);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
