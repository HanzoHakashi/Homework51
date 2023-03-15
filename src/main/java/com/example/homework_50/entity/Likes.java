package com.example.homework_50.entity;

import lombok.Data;

import java.time.LocalDate;
import java.util.Map;

@Data
public class Likes {
   private String likedPost;//id of post
   private LocalDate dateOfLike;
   private String likedUser;
}
