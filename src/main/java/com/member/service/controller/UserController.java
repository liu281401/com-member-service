package com.member.service.controller;

import com.member.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname: Usercontroller
 * @Description: TODO
 * @Date: 2019-07-31 14:27
 * @Author: Yu.Liu
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/list")
    public  void insert(@RequestParam("id") String id){
        userService.insert1(id);
        userService.insert2(id+"2");
    }

}
