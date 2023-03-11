package com.burakbayramin.service;

import com.burakbayramin.dto.UserDto;
import com.burakbayramin.entity.User;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);
    List<UserDto> getUsers();
    UserDto getUser(Long id);
    UserDto updateUser(Long id, UserDto user);
    Boolean deleteUser(Long id);
}
