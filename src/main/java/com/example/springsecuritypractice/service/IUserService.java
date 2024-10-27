package com.example.springsecuritypractice.service;


import com.example.springsecuritypractice.entity.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    public User createUser(User user);

    public List<User> getAllUser();

    public Optional<User> getUserByID(int id);
}
