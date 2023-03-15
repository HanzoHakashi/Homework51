package com.example.homework_50.dao;

import com.example.homework_50.entity.Publication;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
//первое задание
@Component
@RequiredArgsConstructor
public class PublicationDao {
    private final JdbcTemplate jdbcTemplate;
    public List<Publication> selectPostsOfUser(String userEmail){//email of account owner
        String sql = String.format("select * from publications where email not like '%s'",userEmail);//not like
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Publication.class));
    }
    public List<Publication> selectPostsBySub(String userEmail){//email of account owner
        String sql = String.format("select * from publications where email in(select subscription from subscriptions where userEmail = '%s' )",userEmail);
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Publication.class));
    }
}
