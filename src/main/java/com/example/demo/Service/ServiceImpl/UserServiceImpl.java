package com.example.demo.Service.ServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepo;
import com.example.demo.Service.UserService;
import com.example.demo.utility.ResponseStructure;

@Service
	public class UserServiceImpl implements UserService{
	private UserRepo userRepo;
	private ResponseStructure<User> structure;
	@Override
	public ResponseEntity<ResponseStructure<User>> saveUser(User user){
		User uniqueUser=userRepo.save(user);
		return ResponseEntity.ok(structure.setStatuscode(HttpStatus.OK.value())
				.setMessage("Data Saved Successfully")
				.setData(uniqueUser));
	}



	}

