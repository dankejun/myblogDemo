package com.example.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ThymleafTestController {

    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("msg", "I Love Java");
        return "msg";
    }
}
