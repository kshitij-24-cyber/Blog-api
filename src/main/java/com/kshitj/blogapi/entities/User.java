package com.kshitj.blogapi.entities;/*
 * Author Name:Kshitij sahu
 * IDE: intellij IDEA Community Edition
 * Date: 03-09-2022
 */


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "user_name", nullable = false, length = 100)
    private String Name;
    private String Email;
    private String Password;
    private String About;


}
