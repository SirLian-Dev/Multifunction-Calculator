package com.julian.multicalc.domain.service;

public class CalculatorService {

    private String currentInput = "0";

    public String appendDigit(String digit) {

        if ("0".equals(currentInput)) {
            currentInput = digit;
        } else {
            currentInput += digit;
        }

        return currentInput;
    }

    public String clear() {
        currentInput = "0";
        return currentInput;
    }

    public String getCurrentInput() {
        return currentInput;
    }
}