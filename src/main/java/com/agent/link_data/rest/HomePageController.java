package com.agent.link_data.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomePageController {

    @RequestMapping("/home")
    public String index(Model model) {
        return "index";
    }

}
