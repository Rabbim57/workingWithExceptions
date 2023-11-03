package hw;


import hw.exeption.WrongLoginException;
import hw.exeption.WrongPasswordException;

public class HW {
    private static String LEGAL_CHARACTERS =
            "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890_";
    private static final int MAX_LENGHT = 20;

    public static void hw(
            String login,
            String password,
            String confirmPassword
    ) {
        Login(login);
        Password(password, confirmPassword);
    }


    private static void Login(String login) {
        for (int i = 0; i < login.length(); ++i) {
            if (LEGAL_CHARACTERS.indexOf(login.charAt(i)) == -1) {
                throw new WrongLoginException("Логин содержит недопустимые символы");

            }
        }
        if (login.length() > MAX_LENGHT) {
            throw new WrongLoginException("Длина логина превышает максимум. Максимальная длинна = " + MAX_LENGHT);

        }

    }

    private static void Password(String password, String confirmPassword) {
        for (int i = 0; i < password.length(); ++i) {
            if (LEGAL_CHARACTERS.indexOf(password.charAt(i)) == -1) {
                throw new WrongPasswordException("Пароля содержит недопустимые символы");
            }
        }
        if (password.length() > MAX_LENGHT) {
            throw new WrongPasswordException("Длина пароля превышает максимум. Максимальная длинна = " + MAX_LENGHT);
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совподают");
        }
    }
}
