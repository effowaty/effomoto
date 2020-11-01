package com.effomoto.configuration;

import com.effomoto.model.User;
import com.effomoto.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Initializer implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        createTestUsers();
    }

    private void createTestUsers() {
        userRepository.save(User.builder().name("Jan").surname("Kowalski").email("test@test.pl").build());
        userRepository.save(User.builder().name("Anna").surname("Nowak").email("test@test.pl").build());
        userRepository.save(User.builder().name("Asia").surname("Leszczyk").email("test@test.pl").build());
        userRepository.save(User.builder().name("Damian").surname("Augustyniak").email("test@test.pl").build());
    }
}
