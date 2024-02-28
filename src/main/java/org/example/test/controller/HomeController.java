package org.example.test.controller;

import java.util.ArrayList;
import java.util.List;
import org.example.test.domain.CartDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String home(Model model){
        model.addAttribute("content", "product-list-starred");
        return "layout";
    }
    @GetMapping("/myPage")
    public String myPage(Model model) {
        model.addAttribute("content", "user-detail");
        return "layout";
    }
    @GetMapping("/notice")
    public String noticePage(Model model) {
        model.addAttribute("content", "notice");

        return "layout";
    }
    @GetMapping("/allPage")
    public String allPage(Model model) {
        model.addAttribute("content", "product-list");
        return "layout";
    }
    @GetMapping("/modify")
    public String modify(Model model) {
        model.addAttribute("content", "user-detail-modify");
        return "layout";
    }
    @GetMapping("/detail/1")
    public String detail(Model model){
        model.addAttribute("content", "product-detail");
        model.addAttribute("won", 6000);
        return "layout";
    }
    @GetMapping("/cart")
    public String cart(Model model){
        List<CartDto> cartList = new ArrayList<>();
        cartList.add(new CartDto("상품1","브랜드", 10000, 5000, List.of("태그1", "태그2"), "/images/noddle", "1box",1));
        cartList.add(new CartDto("소고기","국내산", 100000, 90000, List.of("태그3", "태그2"), "/images/beef", "500g",1));

        model.addAttribute("cartList", cartList);
        model.addAttribute("content", "cart");
        return "layout";
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
