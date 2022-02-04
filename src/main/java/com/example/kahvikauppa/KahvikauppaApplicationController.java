package com.example.kahvikauppa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KahvikauppaApplicationController {
    
    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/kahvilaitteet")
    public String kahvilaitteet() {
        return "kahvilaitteet";
    }

    @GetMapping("/kulutustuotteet")
    public String kulutustuotteet() {
        return "kulutustuotteet";
    }
}
