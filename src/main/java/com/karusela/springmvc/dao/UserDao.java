package com.karusela.springmvc.dao;

import com.karusela.springmvc.entity.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();
}