package com.jk.education.controller;


import com.jk.education.user.common.model.PageResult;
import com.jk.education.user.common.model.User;
import com.jk.education.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/findAll")
    public String findAll(Model model, User user, Integer page,  Integer rows){
        if(page ==null){
            page=1;
        }
        if( rows==null){
            rows=5;
        }
        PageResult pageResult  = userService.userList(user,page,rows);
        model.addAttribute("page" , pageResult);

        return "userlist";
    }

    @RequestMapping("/deleteUserById")
    public String deleteUser(Long id) {

        userService.deleteUserById(id);
        return "redirect:/findAll";
    }


    @RequestMapping("/findUserById")
    public String findUserById(Long id,Model model){
        User user = userService.findById(id);
        model.addAttribute("user",user);
        return "updateUser";
    }

    @RequestMapping("/addUser")
    public String addUser(){
        return "addUser";
    }

    @RequestMapping("/save")
    public String save(User user){
        userService.saveAndFlush(user);
        return "redirect:/findAll";
    }
}
