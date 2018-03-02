package com.tr.selenium.model;

public class SessionData {

    String user;
    String password;

    public String getUser() {
        return user;
    }

    public SessionData setUser(String user) {
        this.user = user;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public SessionData setPassword(String password) {
        this.password = password;
        return this;
    }
}
