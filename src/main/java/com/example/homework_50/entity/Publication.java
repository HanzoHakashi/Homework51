package com.example.homework_50.entity;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Publication {
    private String id;
    private String image;
    private String description;
    private LocalDate postDate;
    private String email;//author of publication
}
