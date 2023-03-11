package com.burakbayramin.controller;

import com.burakbayramin.dto.UserDto;
import com.burakbayramin.entity.User;
import com.burakbayramin.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto users) {
        UserDto resultUser = userService.createUser(users);
        return ResponseEntity.ok(resultUser);
    }
    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> getUsers() {
        List<UserDto> users = userService.getUsers();
        return ResponseEntity.ok(users);
    }
    @GetMapping("/users/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable("id") Long id) {
        UserDto user = userService.getUser(id);
        return ResponseEntity.ok(user);
    }
    @PutMapping("/users/{id}")
    public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long id, @RequestBody UserDto user) {
        UserDto result = userService.updateUser(id, user);
        return ResponseEntity.ok(result);
    }
    @DeleteMapping("/users/{id}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable("id") Long id) {
        Boolean status = userService.deleteUser(id);
        return ResponseEntity.ok(status);
    }

}
