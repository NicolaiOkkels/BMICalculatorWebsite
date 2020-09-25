package com.example.demo.controller;

import com.example.demo.service.Calculator;
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
        Calculator calculator = new Calculator();
        double bmi = calculator.bmiCalculator(weight,heigthInCentimenters);
        model.addAttribute("calc", bmi); // key (calc)-value (bmi)
        return "result";
    }

}
