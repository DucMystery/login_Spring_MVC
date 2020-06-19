package com.codegym.model;

public class User {
    private String account;
    private String password;
    private String name;
    private String email;
    private int age;

    public User() {
    }

    public User(String account, String password, String name, String email, int age) {
        this.account = account;
        this.password = password;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getAccount() {
        return account;
    }

    public User setAccount(String account) {
        this.account = account;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }
}
