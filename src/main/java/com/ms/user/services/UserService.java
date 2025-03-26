package com.ms.user.services;

import org.springframework.stereotype.Service;

import com.ms.user.models.User;
import com.ms.user.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    // Ponto de Injecao 

    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
       this.userRepository = userRepository;
    }

    @Transactional
    public User save(User user){
        return userRepository.save(user);
    }
}
