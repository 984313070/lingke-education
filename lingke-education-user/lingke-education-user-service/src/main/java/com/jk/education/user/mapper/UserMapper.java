package com.jk.education.user.mapper;

import com.jk.education.user.common.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> userList(User user);

    int getItemsCount();

    List findByPage(@Param("start") Integer start, @Param("rows")Integer rows);
}