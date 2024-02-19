package org.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String home(Model model){
        model.addAttribute("content", "main-content");
        return "shop";
    }
    @GetMapping("/myPage")
    public String myPage(Model model) {
        model.addAttribute("content", "myPage");
        return "shop";
    }
    @GetMapping("/notice")
    public String noticePage(Model model) {
        model.addAttribute("content", "notice");

        return "shop";
    }
    @GetMapping("/allPage")
    public String allPage(Model model) {
        model.addAttribute("content", "allPage");
        return "shop";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
