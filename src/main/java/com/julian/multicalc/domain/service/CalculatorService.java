package com.julian.multicalc.domain.service;

public class CalculatorService {
	
    private double firstOperand;
    private String operator;
    private String currentInput = "0";

    public String appendDigit(String digit) {
    	
        if ("0".equals(currentInput)) {
            currentInput = digit;
        } else {
            currentInput += digit;
        }
        return currentInput;
    }
    
    public void setOperator(String operator) {

        firstOperand = Double.parseDouble(currentInput);
        this.operator = operator;
        currentInput = "0";
    }

    public String clear() {
        firstOperand = 0;
        operator = null;
        currentInput = "0";
        return currentInput;
    }

    public String getCurrentInput() {
        return currentInput;
    }
    
    public String calculate() {

        double secondOperand=Double.parseDouble(currentInput);
        double result = 0;
       
        switch (operator) {
            case "+": result = firstOperand + secondOperand;break;

            case "-": result = firstOperand - secondOperand;break;

            case "×": result = firstOperand * secondOperand;break;

            case "÷":result = firstOperand / secondOperand;break;
        }
        
        currentInput = String.valueOf(result);
        return currentInput;
    }
    
    public String getOperationText() {
        return firstOperand + " " + operator;
    }
}