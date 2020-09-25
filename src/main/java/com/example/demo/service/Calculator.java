package com.example.demo.service;

public class Calculator {
    public double bmiCalculator(double weight, double heigthInCentimenters){
        double heightInMeters = heigthInCentimenters / 100;
        double bmi = weight / Math.pow(heightInMeters, 2);
        double roundOff = Math.round(bmi * 100.0) / 100.0;

        return roundOff;
    }
}
