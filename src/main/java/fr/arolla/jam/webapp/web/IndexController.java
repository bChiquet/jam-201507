package fr.arolla.jam.webapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String root(Model model) {
        model.addAttribute("view", "views/home");
        return "template";
    }

    @RequestMapping(value = "/home")
    public String home(Model model) {
        model.addAttribute("view", "views/home");
        return "template";
    }
}
