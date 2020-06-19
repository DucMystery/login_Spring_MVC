package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private static List<User> users;

    static {
        users =new ArrayList<>();
        User user1 =new User();
        user1.setAge(10);
        user1.setName("Duc");
        user1.setAccount("mystery1309");
        user1.setEmail("abc@gmail.com");
        user1.setPassword("123456");
        users.add(user1);

        User user2 =new User();
        user2.setAge(23);
        user2.setName("Long");
        user2.setAccount("LongSex");
        user2.setEmail("long@gmail.com");
        user2.setPassword("123456");
        users.add(user2);

        User user3 =new User();
        user3.setAge(24);
        user3.setName("Doan");
        user3.setAccount("doandaudon");
        user3.setEmail("doan@gmail.com");
        user3.setPassword("123456");
        users.add(user3);
    }

    public static User checkLogin(Login login){
        for (User user:users){
            if (user.getAccount().equals(login.getAccount())
            && user.getPassword().equals(login.getPassword())){
                return user;
            }
        }
        return null;
    }
}
