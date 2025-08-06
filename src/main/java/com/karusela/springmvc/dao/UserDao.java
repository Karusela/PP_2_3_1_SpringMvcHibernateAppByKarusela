package com.karusela.springmvc.dao;

import com.karusela.springmvc.entity.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUser(int id);
    public void deleteUser(int id);
}