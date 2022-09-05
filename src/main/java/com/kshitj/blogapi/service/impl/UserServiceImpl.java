package com.kshitj.blogapi.service.impl;/*
 * Author Name:Kshitij sahu
 * IDE: intellij IDEA Community Edition
 * Date: 03-09-2022
 */

import com.kshitj.blogapi.entities.User;
import com.kshitj.blogapi.exception.ResourceNotFoundException;
import com.kshitj.blogapi.payloads.UserDTO;
import com.kshitj.blogapi.repository.UserRepository;
import com.kshitj.blogapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO addUser(UserDTO userDTO) {
        User user = this.DtoToUser(userDTO);
        User savedUser = this.userRepository.save(user);
        return this.userToDTO(savedUser);
    }

    @Override
    public UserDTO updateUser(UserDTO userDto, Integer userId) {
        User user = this.userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
        user.setName(userDto.getName());
        user.setEmail(user.getEmail());
        user.setPassword(user.getPassword());
        user.setAbout(user.getAbout());
        User updateUser = this.userRepository.save(user);
        UserDTO updatedUserDto = this.userToDTO(updateUser);
        return updatedUserDto;
    }

    @Override
    public UserDTO getUserById(Integer userId) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUser() {
        return null;
    }

    @Override
    public void deleteUserById(UserDTO userId) {

    }

    private User DtoToUser(UserDTO userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(user.getPassword());
        user.setAbout(user.getAbout());
        return user;
    }

    private UserDTO userToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userDTO.getId());
        userDTO.setName(userDTO.getName());
        userDTO.setEmail(userDTO.getEmail());
        userDTO.setPassword(userDTO.getPassword());
        userDTO.setAbout(userDTO.getAbout());
        return userDTO;
    }
}
