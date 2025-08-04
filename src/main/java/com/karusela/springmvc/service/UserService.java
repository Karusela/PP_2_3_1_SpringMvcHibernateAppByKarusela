package com.karusela.springmvc.service;

import com.karusela.springmvc.entity.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();
}