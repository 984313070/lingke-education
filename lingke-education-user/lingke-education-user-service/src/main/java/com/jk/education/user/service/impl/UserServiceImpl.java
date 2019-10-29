package com.jk.education.user.service.impl;

import com.jk.education.user.common.model.PageResult;
import com.jk.education.user.common.model.User;

import com.jk.education.user.mapper.UserMapper;
import com.jk.education.user.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserSerivce {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageResult userList(User user, Integer pageNum, Integer rows) {
        PageResult page = new PageResult();
        page.setNumPerPage(rows);
        page.setCurrent(pageNum);

        int totalCount = userMapper.getItemsCount();
        page.setTotalCount(totalCount);//设置总记录数
        int start = (pageNum - 1)*rows;
        List<User> list = userMapper.findByPage(start, rows);
        //设置当前页面数据
        page.setUserList(list);
        return page;

    }

    @Override
    public void deleteUserById(Long userId) {
        userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public User findById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveAndFlush(User user) {
        userMapper.insert(user);
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKey(user);
    }
}
