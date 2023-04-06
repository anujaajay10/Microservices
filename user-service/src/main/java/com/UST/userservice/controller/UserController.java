package com.UST.userservice.controller;

import com.UST.userservice.VO.ResponseTemplateVO;
import com.UST.userservice.entity.User;
import com.UST.userservice.service.UserServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserServices userservices;
    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("inside saveUser of UserController");
        return userservices.saveuser(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id")Long userId){
        log.info("inside getUserWithDepartment of UserController");
        return userservices.getUserWithDepartment(userId);
    }


}
