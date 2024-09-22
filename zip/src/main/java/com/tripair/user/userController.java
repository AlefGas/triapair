package com.tripair.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class userController {

    @Autowired
    userService service;

    @GetMapping
    public List<user> findAll(@RequestParam(required = false) String name){
        if (name != null) return service.findByName(name);
        return service.findAll();
    }

}
