package com.springcourse.curso.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcourse.curso.models.User;
import com.springcourse.curso.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRESTController {

    @GetMapping(path = "/details")
    public UserDto details() {
        UserDto userDto = new UserDto();
        User user = new User("Jordi", "García","");

        userDto.setUser(user);
        userDto.setTitle("Este soy yo");

        return userDto;
    }

    @GetMapping(path = "/list")
    public List<User> list(){
        User user = new User("Jordi", "García","");
        User user2 = new User("Maria", "Torres","");
        User user3 = new User("Jorge", "García","");
        List<User> users = new ArrayList<>();

        users.add(user);
        users.add(user2);
        users.add(user3);

        return users;
    }
}
