package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.user.IUserService;
import com.example.demo.exception.InsufficientInformationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        if (user.getName() == null || user.getLastName() == null || user.getNickname() == null 
            || user.getPassword() == null || user.getEmail() == null) {
            throw new InsufficientInformationException("Porfavor, provee toda la informacion del usuario");
        }
        ResponseEntity<User> savedUser = userService.insertUser(user);
        return new ResponseEntity<>(savedUser.getBody(), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        if (user.getName() == null || user.getLastName() == null || user.getNickname() == null 
            || user.getPassword() == null || user.getEmail() == null) {
            throw new InsufficientInformationException("Porfavor, provee toda la informacion del usuario");
        }
        ResponseEntity<User> updatedUser = userService.updateUserById(id, user);
        return new ResponseEntity<>(updatedUser.getBody(), HttpStatus.OK);
    }
}
