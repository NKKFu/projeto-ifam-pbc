package utils;

public class ValidacaoCPF {
    public static boolean validar(String cpf) {
        return cpf.matches("[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}-?[0-9]{2}");
    }
}
