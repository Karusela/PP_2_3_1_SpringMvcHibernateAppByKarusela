package com.karusela.springmvc.controller;

import com.karusela.springmvc.entity.User;
import com.karusela.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public String showUsers(@RequestParam(value = "count", required = false) Integer count, Model model) {

        List<User> cars = new ArrayList<>();

        return "index";
    }


}
