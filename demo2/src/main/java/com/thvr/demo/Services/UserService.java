package com.thvr.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thvr.demo.Entity.User;
import com.thvr.demo.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	// Creating Users
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	// Reading all the users	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	// Reading a user by id
	public Optional<User> getUserbyId(long id){
		return userRepository.findById(id);
	}
	
	// Update
	
	public User updateUser(Long id, User userDetails) {
		
		User user= userRepository.findById(id).orElseThrow();
		user.setName(userDetails.getName());
		user.setEmail(userDetails.getEmail());
		return userRepository.save(user);
		
	}
	
	// Delete
	
	public void deleteUser(Long id) {
		
		userRepository.deleteById(id);
		
	}
	
}
