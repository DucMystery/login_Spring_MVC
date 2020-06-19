package com.codegym.model;

public class Login {

    private String account;
    private String password;

    public String getAccount() {
        return account;
    }

    public Login() {
    }

    public Login(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public Login setAccount(String account) {
        this.account = account;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Login setPassword(String password) {
        this.password = password;
        return this;
    }
}
