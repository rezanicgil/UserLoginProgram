package com.company;

import java.util.ArrayList;

public class User {
    private String username = "admin";
    private char[] password = "admin".toCharArray();

    public void setPassword(char[] password) {
        this.password = password;
    }

    public char[] getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
