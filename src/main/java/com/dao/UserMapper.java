package com.dao;

import com.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Object userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Object userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}