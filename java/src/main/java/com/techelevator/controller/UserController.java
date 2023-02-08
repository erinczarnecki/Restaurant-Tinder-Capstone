package com.techelevator.controller;


import com.techelevator.dao.UserDao;
import com.techelevator.model.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
//@PreAuthorize("isAuthenticated")
public class UserController {

    private UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }


    @RequestMapping(path = "/user/{userId}", method = RequestMethod.GET)
    public User listUserById(@PathVariable Long userId) {
        return userDao.getUserById(userId);
    }


    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public List<User> getAllUsers(Principal principal) {
        return userDao.findAll();
    }

}
