package view;
import model.AllUsers;
import model.DeleteUsers;

import java.util.Scanner;

public class AdminView {
    private final Scanner scanner = new Scanner(System.in);
    public void menu() {
        System.out.println("[Администратор] Меню:");
        System.out.println("1. Просмотр пользователей");
        System.out.println("2. Удаление пользователей");
        System.out.println("3. Создание ЦИК");
        System.out.println("4. Удаление ЦИК");
        System.out.println("5. Просмотр кандидатов");
        System.out.println("6. Удаление кандидатов");
        // логика обработки выбора
        System.out.print("Выберите номер варианта: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                new AllUsers().allusers();
                break;
            case "2":
                new DeleteUsers().deleteusers();
        }
    }
     public void viewing() {
        System.out.println("Все пользователи: ");
     }

}