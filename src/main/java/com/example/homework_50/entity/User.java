package com.example.homework_50.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class User {
    private String name;
    private String username;
    private String email;
    private String password;
    private int counter;

    public User(String name, String username, String email, String password, int counter) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.counter = counter;
    }
}
