package com.jk.education.user.service;

import com.jk.education.user.common.model.PageResult;
import com.jk.education.user.common.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import sun.util.resources.ga.LocaleNames_ga;

import java.util.List;

public interface UserSerivce {
    /**
     * 用户列表信息
     * @param user
     * @return
     */
    public PageResult userList(User user, Integer page, Integer rows);

    void deleteUserById(Long userId);

    User findById(Long id);

    void saveAndFlush(User user);

    void update(User user);
}
