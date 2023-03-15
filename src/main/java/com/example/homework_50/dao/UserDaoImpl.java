package com.example.homework_50.dao;

import com.example.homework_50.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
//Метод работает, если через постмен отправить запрос, данные идут сразу в базу.
    public int addUser(User user) {
        String sql = "INSERT into users(name,username,email,password,counter) VALUES (?,?,?,?,?);";
        return jdbcTemplate.update(sql,user.getName(),user.getUsername(),user.getEmail(),user.getPassword(),user.getCounter());
    }
    public int addPublication(Publication publication) {
        String sql = "INSERT into publication(id,image,description,postDate,counter) VALUES (?,?,?,?,?);";
        return jdbcTemplate.update(sql,publication.getId(),publication.getImage(),publication.getDescription(),publication.getPostDate(),publication.getEmail());
    }

    public int addSub(Subscriptions s) {
        String sql = "INSERT into publication(userEmail,subscriber,subscription,dateOfEvent) VALUES (?,?,?,?);";
        return jdbcTemplate.update(sql,s.getUserEmail(),s.getSubscriber(),s.getSubscription(),s.getDateOfEvent());
    }
    public int addComment(Comment c) {
        String sql = "INSERT into publication(text,timeOfComment,postDate,author) VALUES (?,?,?);";
        return jdbcTemplate.update(sql,c.getText(),c.getTimeOfComment(),c.getAuthor());
    }
    public int addLikes(Likes l) {
        String sql = "INSERT into publication(image,description,postDate,counter) VALUES (?,?,?);";
        return jdbcTemplate.update(sql,l.getLikedPost(),l.getDateOfLike(),l.getLikedUser());
    }
    //первое задание
    public List<User> getUsersByName(String name){
        String sql = String.format("select * from users where name = '%s'",name);
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    }

    public List<User> getUsersByUserName(String username){
        String sql = String.format("select * from users where username = '%s'",username);
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    }
    public List<User> getUsersByEmail(String email){
        String sql = String.format("select * from users where name = '%s'",email);
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    }
}
