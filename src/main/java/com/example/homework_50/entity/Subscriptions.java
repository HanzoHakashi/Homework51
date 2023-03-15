package com.example.homework_50.entity;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public class Subscriptions {
    private String userEmail;//email of account owner
    private String subscriber;//email of subscriber
    private String subscription;//email of subscriptions
    private LocalDate dateOfEvent;
}
