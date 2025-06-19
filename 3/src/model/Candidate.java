package model;

public class Candidate extends User {
    public Candidate(String login, String password) {
        super(login, password, "CANDIDATE");
    }
}
