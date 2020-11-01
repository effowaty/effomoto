package com.effomoto.controller;

import com.effomoto.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/user")
public interface UserControllerApi {
    @GetMapping
    List<User> getUsers();

    @GetMapping("/{id}")
    User getById(Long idUser);

    @PostMapping
    Long create(User user);
}
