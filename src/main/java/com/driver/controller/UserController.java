package com.driver.controller;
import com.driver.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/create")
    public ResponseEntity < Void > createUser(@RequestParam String username, @RequestParam String password) {
        // Create a new user with given username and password
        userService.createUser(username, password);
        return new ResponseEntity < > (HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{userId}")
    public ResponseEntity < Void > deleteUser(@PathVariable int userId) {
        // Delete user using deleteById
        userService.deleteUser(userId);
        return new ResponseEntity < > (HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity < Void > updateUser(@RequestParam Integer id, @RequestParam String password) {
        // Update password of given user
        userService.updateUser(id, password);
        return new ResponseEntity < > (HttpStatus.OK);
    }
}