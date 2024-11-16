package com.springcourse.curso.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springcourse.curso.models.User;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Jordi", "García", "jordigarciatorres@mail.com");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping(path = "/detailslist")
    public String detailsList(ModelMap modelMap) {
        List<User> users = Arrays.asList(new User("pepa", "gonzalez", "" ),
        new User("Jordi", "Garcia", "jordi@gmail.com"));
        modelMap.addAttribute("users", users);
        modelMap.addAttribute("title", "List Thymeleaf");
        return "list";
    }
    
    @ModelAttribute("users")
    public List<User> usersModel() {
        return Arrays.asList(
            new User("pepa", "gonzalez", "" ),
            new User("Jordi", "Garcia", "jordi@gmail.com")
        );
    }
}
