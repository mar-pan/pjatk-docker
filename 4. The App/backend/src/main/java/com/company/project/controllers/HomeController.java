package com.company.project.controllers;

import com.company.project.entity.Greeting;
import com.company.project.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    private GreetingRepository repository;

    @GetMapping("/")
    public Greeting showHome(String name, Model model) {
        return repository.findById(1).orElse(new Greeting("Not Found 😕"));
    }

    //todo uncomment below code and rebuild your docker project
//    @RequestMapping(value = "/myEndpoint", method = RequestMethod.GET)
//    public String showHome() {
//        return "Say My Name! - You're Heisenberg";
//    }
}
