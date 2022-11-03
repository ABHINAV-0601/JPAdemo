package com.example.JPAdemo.repository;

import com.example.JPAdemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    List<User> findByFirstName(String firstName);
}
