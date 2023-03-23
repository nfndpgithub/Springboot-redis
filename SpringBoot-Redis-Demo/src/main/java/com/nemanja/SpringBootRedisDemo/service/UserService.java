package com.nemanja.SpringBootRedisDemo.service;

import com.nemanja.SpringBootRedisDemo.model.User;

import java.util.List;

public interface UserService {
    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);

    boolean upadateUser(Long id, User user);
}
