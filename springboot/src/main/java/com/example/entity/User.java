package com.example.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class User extends Account implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private String avatar;
    private String role;
    private String sex;
    private String phone;
    private String email;
    private String info;
    private String birth;
}
