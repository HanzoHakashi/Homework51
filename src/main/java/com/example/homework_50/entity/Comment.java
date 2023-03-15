package com.example.homework_50.entity;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Comment {
    private String text;
    private LocalDate timeOfComment;
}
