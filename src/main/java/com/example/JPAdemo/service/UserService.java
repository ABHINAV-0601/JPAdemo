package com.example.JPAdemo.service;

import com.example.JPAdemo.domain.User;

import java.util.List;

public interface UserService {

     User addUser(User user);
    List<User> getAllUsers();
    User updateUser(User user,String email);
    boolean deleteUserByEmail(String email);
    List<User> getUserByFirstName(String firstName);
}
