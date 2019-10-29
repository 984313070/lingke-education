package com.jk.education.user.common.interfaces;

import com.jk.education.user.common.model.PageResult;
import com.jk.education.user.common.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public interface UserServiceApi {


    @RequestMapping("/findAll")
    public PageResult userList(@RequestBody User user, @RequestParam Integer page, @RequestParam Integer rows);

    @RequestMapping("/deleteUserById")
    public void deleteUserById(Long userId);

    @RequestMapping("/findUserById")
    User findById(Long id);

    @RequestMapping("/save")
    void saveAndFlush(User user);
}
