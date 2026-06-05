package com.julian.multicalc.presentation.controller;

import com.julian.multicalc.domain.service.CalculatorService;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalculatorController {

    @FXML
    private Label resultLabel;
    
    @FXML
    private Label operationLabel;

    private final CalculatorService calculatorService=new CalculatorService();

    @FXML
    public void initialize() {
    	//Valor inicial de la calculadora.
        resultLabel.setText(calculatorService.getCurrentInput());
    }

    @FXML
    private void onDigitPressed(javafx.event.ActionEvent event) {
    	// Obtiene el texto del bóton y concatena con el número actual.
        String digit =((javafx.scene.control.Button)event.getSource()).getText();
        resultLabel.setText(calculatorService.appendDigit(digit));
    }

    @FXML
    private void onClearPressed() {
    	//Limpia la calculadora y muestra el valor inicial.
        resultLabel.setText(calculatorService.clear());
    }
    
    @FXML
    private void onOperatorPressed(javafx.event.ActionEvent event) {
    	// Obtiene el texto del bóton y concatena con el operador actual.
        String operator=((javafx.scene.control.Button)event.getSource()).getText();
        calculatorService.setOperator(operator);
        operationLabel.setText(calculatorService.getOperationText());
    }
    
    @FXML
    private void onEqualsPressed() {
    	// Realiza el cálculo y muestra el resultado.
        String result =calculatorService.calculate();
        resultLabel.setText(result);
        operationLabel.setText("");
    }
    
}