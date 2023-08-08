package utils;

public class ValidacaoEmail {
    public static boolean validar(String email) {
        return email.matches("[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}");
    }
}
