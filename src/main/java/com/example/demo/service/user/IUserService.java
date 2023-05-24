package com.example.demo.service.user;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.model.User;

@Service("userService")
public interface IUserService {
	public ResponseEntity<List<User>> findUser();

    public ResponseEntity<User> findUserById(Long id);

    public ResponseEntity<User> updateUserById(Long id, User user);

    public ResponseEntity<User> insertUser(User user);
}
