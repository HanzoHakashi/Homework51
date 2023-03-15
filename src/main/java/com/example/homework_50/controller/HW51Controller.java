package com.example.homework_50.controller;

import com.example.homework_50.dao.UserDaoImpl;
import com.example.homework_50.entity.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HW51Controller {
    private final UserDaoImpl userDao;
    //Метод работает, если через постмен отправить запрос, в виде json данные идут сразу в базу.
    //Теперь, мне нужно добавить не только юзера, но и все данные. не могу понять, данные нужно заполнять таким образом
    //или нужно написать метод для их генерации.
    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        userDao.addUser(user);
    }
    @PostMapping("/addPublication")
    public void addPublication(@RequestBody Publication p){
        userDao.addPublication(p);
    }
    @PostMapping("/addLikes")
    public void addLikes(@RequestBody Likes likes){
        userDao.addLikes(likes);
    }
    @PostMapping("/addSubscriptions")
    public void addSubscriptions(@RequestBody Subscriptions s){
        userDao.addSub(s);
    }
    @PostMapping("/addComment")
    public void addComment(@RequestBody Comment c){
        userDao.addComment(c);
    }
//На данный момент реализация такая, так как пока насчет генерации не уверен, в идеале, при
//будут сразу генерироваться все данные, так как код вышел масивным, поищу sql компанду, которая сразу сделает генерацию
//в одном методе. и только при одном роуте допустим add будет генерироваться вся база.
}
