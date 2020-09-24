package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping("/")
    public String start() {
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam double weight, @RequestParam double heigthInCentimenters, Model model) {
        double heightInMeters = heigthInCentimenters / 100;
        double bmi = weight / Math.pow(heightInMeters, 2);
        double roundOff = Math.round(bmi * 100.0) / 100.0;
        model.addAttribute("calc", roundOff); // key (calc)-value (num3)
        return "result";
    }

}
