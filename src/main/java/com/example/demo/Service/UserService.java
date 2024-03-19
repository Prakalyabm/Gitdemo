package com.example.demo.Service;

import org.springframework.http.ResponseEntity;

import com.example.demo.Entity.User;
import com.example.demo.utility.ResponseStructure;

public interface UserService {

	ResponseEntity<ResponseStructure<User>> saveUser(User user);

}