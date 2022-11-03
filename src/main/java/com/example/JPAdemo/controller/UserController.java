package com.example.JPAdemo.controller;

import com.example.JPAdemo.domain.User;
import com.example.JPAdemo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userdetails/app/")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping(value="/user")
    public ResponseEntity<?> addUser(@RequestBody User user){
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }
    @GetMapping(value = "/users")
    public ResponseEntity<?> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
    }
    @DeleteMapping(value = "/user/{email}")
    public ResponseEntity<?> deleteUser(@PathVariable String email){
        return new ResponseEntity<>(userService.deleteUserByEmail(email),HttpStatus.OK);
    }
    @GetMapping(value = "/users/{firstName}")
    public ResponseEntity<?> fetchByName(@PathVariable String firstName){
        return new ResponseEntity<>(userService.getUserByFirstName(firstName),HttpStatus.OK);
    }
    @PutMapping(value = "/user/{email}")
    public ResponseEntity<?> updateUser(@RequestBody User user,@PathVariable String email){
        return new ResponseEntity<>(userService.updateUser(user,email),HttpStatus.OK);
    }
}
