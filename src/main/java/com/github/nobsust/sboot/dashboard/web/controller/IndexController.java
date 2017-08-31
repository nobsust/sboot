package com.github.nobsust.sboot.dashboard.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(("/index"))
public class IndexController {

    @RequestMapping
    public String index(Model model) {
        model.addAttribute("name", "sboot");
        return "index";
    }

}
