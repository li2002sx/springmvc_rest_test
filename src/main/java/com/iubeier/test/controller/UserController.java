package com.iubeier.test.controller;

import com.iubeier.test.entity.UserEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jankie on 16/1/10.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public UserEntity view(@PathVariable("id") Long id) {
        UserEntity user = new UserEntity();
        user.setId(id);
        user.setName("zhang");
        return user;
    }
}
