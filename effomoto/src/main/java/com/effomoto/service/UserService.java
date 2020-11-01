package com.effomoto.service;

import com.effomoto.model.User;
import com.effomoto.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getById(Long idUser) {
        return userRepository.findById(idUser);
    }

    public Long create(User user) {
        return userRepository.save(user).getIdUser();
    }
}
