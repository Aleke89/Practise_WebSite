package com.example.CAR__KIT.service;

import com.example.CAR__KIT.dto.UserDto;
import com.example.CAR__KIT.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
