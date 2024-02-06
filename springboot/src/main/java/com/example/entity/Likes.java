package com.example.entity;

import lombok.Data;

@Data
public class Likes {
    private Integer id;
    private Integer userId;
    private Integer fid;
    private String module;
}
