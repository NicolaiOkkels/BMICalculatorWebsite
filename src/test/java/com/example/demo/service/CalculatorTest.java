package com.example.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void calculateBmiValidNumbers() {
        //Arrange
        Calculator calculator = new Calculator();
        double weightNumber = 75;
        double heightNumber = 180;
        //add
        double result = calculator.bmiCalculator(weightNumber, heightNumber);
        //assert
        assertEquals(23.15,result);
    }
}