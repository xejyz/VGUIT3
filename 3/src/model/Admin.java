package model;

public class Admin extends User {
    public Admin(String login, String password) {
        super(login, password, "ADMIN");
    }
}

