package com.example.common.enums;

public enum LikesModuleEnum {
    BLOG("博客"),
    ACTIVITY("活动");
    private String value;

    LikesModuleEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
