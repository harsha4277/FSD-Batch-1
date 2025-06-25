package com.thvr.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.thvr.demo.Entity.User;
import com.thvr.demo.Services.UserService;



import java.util.List;

@RestController
@RequestMapping("/api/users")

public class UserController {

    @Autowired
    private UserService userService;

    // CREATE
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // READ (All)
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // READ (By ID)
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserbyId(id).orElse(null);
    }

    // UPDATE
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }
}
