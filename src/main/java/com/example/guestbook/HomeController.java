package com.example.guestbook;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    private String submit;
    private Model model;

    @RequestMapping("/loadform")
    public String loadFormPage() {
        return "sign";
    }

    @RequestMapping("/processform")
    public String loadFromPage(@RequestParam("submit") String submit, Model model) {
        model.addAttribute("submit", submit);
        return "view";
    }
}