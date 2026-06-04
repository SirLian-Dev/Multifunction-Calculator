package com.julian.multicalc.presentation.controller;

import com.julian.multicalc.domain.service.CalculatorService;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalculatorController {

    @FXML
    private Label resultLabel;

    private final CalculatorService calculatorService =
            new CalculatorService();

    @FXML
    public void initialize() {

        resultLabel.setText(
                calculatorService.getCurrentInput()
        );
    }

    @FXML
    private void onDigitPressed(javafx.event.ActionEvent event) {

        String digit =
                ((javafx.scene.control.Button)
                        event.getSource())
                        .getText();

        resultLabel.setText(
                calculatorService.appendDigit(digit)
        );
    }

    @FXML
    private void onClearPressed() {

        resultLabel.setText(
                calculatorService.clear()
        );
    }
}