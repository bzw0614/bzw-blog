package com.example.entity;

import lombok.Data;

@Data
public class ActivitySign {
    private Integer id;
    private Integer activityId;
    private Integer userId;
    private String time;
    private String activityName;
    private String userName;
}
