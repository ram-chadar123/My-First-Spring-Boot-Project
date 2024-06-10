package com.tka.sams.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.sams.api.entity.User;
import com.tka.sams.api.model.LoginRequest;
import com.tka.sams.api.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/login-user")
	public User loginUser(@RequestBody LoginRequest request) {
		return service.loginUser(request);
		
	}
	
	@PostMapping("/register-user")
	public User registerUser(@RequestBody User user){
		return service.registerUser(user);
		
		
	}
	
	@GetMapping("/get-user-by-username/{username}")
	public User getUserById(@PathVariable String username) {
		return service.getUserById(username);
		
	}
	
	@GetMapping("/get-all-user")
	public List<User> getAllUser() {
		return service.getAllUser();
		
	}
	
	@DeleteMapping("/delete-user-by-username")
	public String deleteUserById(@RequestParam String username) {
		return service.deleteUserById(username);
		
	}
	
	@PutMapping("/update-user")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
		
	}
	
	

}
