package com.effomoto.controller;

import com.effomoto.model.User;
import com.effomoto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements UserControllerApi {
    @Autowired
    private UserService userService;

    @Override
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @Override
    public User getById(Long idUser) {
        return userService.getById(idUser).get();
    }

    @Override
    public Long create(User user) {
        return userService.create(user);
    }
}
