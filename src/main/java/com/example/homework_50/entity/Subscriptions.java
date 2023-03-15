package com.example.homework_50.entity;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public class Subscriptions {
    private List<User> subscribers;
    private List<User> subscriptions;
    private LocalDate dateOfEvent;
}
