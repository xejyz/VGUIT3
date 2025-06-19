package controller;

import model.Database;
import view.*;
import java.util.Scanner;

public class MainController {
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Добро пожаловать в систему электронного голосования.");
        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();


        var user = Database.login(login, password);
        if (user == null) {
            System.out.println("Неверный логин или пароль.");
            return;
        }

        switch (user.getRole()) {
            case "ADMIN":
                new AdminView().menu();
                break;
            case "COMMISSION":
                new CommissionView();
                break;
            case "CANDIDATE":
                new CandidateView();
                break;
            case "USER":
                new UserView();
                break;
            default:
                System.out.println("Неизвестная роль.");
        }
    }
}