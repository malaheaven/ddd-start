package com.study.ddd.common.ui;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String root(Model model, HttpServletRequest request) {
        model.addAttribute("request", request);
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String home(Model model, HttpServletRequest request) {
        model.addAttribute("request", request);
        return "home";
    }
}
