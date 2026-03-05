package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double sqrt(double x) {
        if (x < 0)
            throw new IllegalArgumentException("Negative number not allowed");
        return Math.sqrt(x);
    }

    public long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Negative number not allowed");

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public double ln(double x) {
        if (x <= 0)
            throw new IllegalArgumentException("Input must be positive");
        return Math.log(x);
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }
}