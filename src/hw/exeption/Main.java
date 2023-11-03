package hw.exeption;

import hw.HW;

public class Main {
    public static void main(String[] args) {

        String login = "login123";
        String password = "password123";
        String confirmPassword = "password123";

        try {
            HW.hw(login, password, confirmPassword);
            System.out.println("Валидация прошла успешно !");
        } catch (WrongLoginException wrongLoginException){
            wrongLoginException.printStackTrace();
        } catch (WrongPasswordException wrongPasswordException){
            wrongPasswordException.printStackTrace();
        }
        System.out.println("Валидация завершена !");

    }
}