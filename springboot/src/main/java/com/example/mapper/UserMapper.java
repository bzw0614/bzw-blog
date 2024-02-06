package com.example.mapper;

import com.example.entity.User;

import java.util.List;

public interface UserMapper {
    void insert(User user);
    User selectByUsername(String username);

    void deleteById(Integer id);

    void updateById(User user);

    User selectById(Integer id);

    List<User> selectAll(User user);
}
