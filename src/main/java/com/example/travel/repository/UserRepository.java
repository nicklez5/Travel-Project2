package com.example.travel.property;

import java.util.Optional;


import com.example.travel.controller.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);

}