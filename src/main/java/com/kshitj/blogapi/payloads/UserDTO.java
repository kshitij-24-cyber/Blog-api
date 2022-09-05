package com.kshitj.blogapi.payloads;/*
 * Author Name:Kshitij sahu
 * IDE: intellij IDEA Community Edition
 * Date: 03-09-2022
 */


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    private int id;
    private String name;
    private String email;
    private String password;
    private String About;
}
