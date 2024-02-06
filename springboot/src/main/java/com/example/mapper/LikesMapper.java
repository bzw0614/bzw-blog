package com.example.mapper;

import com.example.entity.Likes;
import org.apache.ibatis.annotations.Param;

public interface LikesMapper {

    void insert(Likes likes);

    Likes selectUserLikes(Likes likes);

    void deleteById(Integer id);

    int selectByFidAndModule(@Param("fid") Integer fid, @Param("module") String module);
}
