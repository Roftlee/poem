package com.lys.controller;

import com.lys.model.User;
import com.lys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: AsiQue
 * @date :2018.06.11 14:49
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;//用户服务

    @RequestMapping(value = "/getUser.do", method = RequestMethod.POST)
    public User getUser(@RequestParam Long userId) throws Exception {

        return userService.selectByPrimaryKey(userId);
    }

    @RequestMapping(value = "/updateUser.do", method = RequestMethod.GET)
    public Integer updateUser(@RequestBody User user) throws Exception {

        return userService.updateByPrimaryKey(user);
    }
}
