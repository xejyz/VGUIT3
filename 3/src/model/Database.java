package model;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<User> users = new ArrayList<>();

    static {
        users.add(new Admin("admin", "admin"));
        users.add(new Commission("cik1", "pass1"));
        users.add(new Candidate("cand1", "pass2"));
        users.add(new RegularUser("user1", "pass3"));
    }

    public static User login(String login, String password) {
        for (User user : users) {
            if (user.getLogin().equals(login) && user.checkPassword(password)) {
                return user;
            }
        }
        return null;
    }
}