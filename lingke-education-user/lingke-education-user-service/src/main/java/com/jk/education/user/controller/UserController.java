package com.jk.education.user.controller;

import com.jk.education.user.common.interfaces.UserServiceApi;
import com.jk.education.user.common.model.PageResult;
import com.jk.education.user.common.model.User;

import com.jk.education.user.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController implements UserServiceApi {

    @Autowired
    private UserSerivce userSerivce;

//    @Value("${foo}")
//    String foo;

    @Override
    public PageResult userList(@RequestBody User user, @RequestParam("page") Integer page, @RequestParam("rows") Integer rows) {
        return userSerivce.userList(user,page,rows);
    }

    @Override
    public void deleteUserById(@RequestBody Long userId) {

        userSerivce.deleteUserById(userId);
    }

    @Override
    public User findById(@RequestBody Long id) {
        return userSerivce.findById(id);
    }

    @Override
    public void saveAndFlush(@RequestBody User user) {
        if(user.getId()!=null){
            userSerivce.update(user);
        }else{
            userSerivce.saveAndFlush(user);
        }

    }

//    @RequestMapping("/hi")
//    public String hi() {
//        return foo;
//    }
}
