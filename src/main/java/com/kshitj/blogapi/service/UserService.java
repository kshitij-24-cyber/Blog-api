package com.kshitj.blogapi.service;/*
 * Author Name:Kshitij sahu
 * IDE: intellij IDEA Community Edition
 * Date: 03-09-2022
 */

import com.kshitj.blogapi.payloads.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO addUser(UserDTO user);

    UserDTO updateUser(UserDTO user, Integer userId);

    UserDTO getUserById(Integer userId);

    List<UserDTO> getAllUser();

    void deleteUserById(UserDTO userId);
}
