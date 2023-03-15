package com.example.homework_50.entity;

import lombok.Data;

import java.time.LocalDate;
import java.util.Map;

@Data
public class Likes {
   private Publication likedPost;
   private LocalDate dateOfLike;
   private User likedUser;
}
