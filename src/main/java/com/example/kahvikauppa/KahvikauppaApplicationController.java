package com.example.kahvikauppa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KahvikauppaApplicationController {
    
    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/laitteet")
    public String laitteet() {
        return "laitteet";
    }

    @GetMapping("/tuotteet")
    public String tuotteet() {
        return "tuotteet";
    }
}
