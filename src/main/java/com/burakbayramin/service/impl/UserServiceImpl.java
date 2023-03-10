package com.burakbayramin.service.impl;

import com.burakbayramin.repository.UserRepository;
import com.burakbayramin.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
