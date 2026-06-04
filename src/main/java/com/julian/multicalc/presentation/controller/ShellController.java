package com.julian.multicalc.presentation.controller;

import com.julian.multicalc.presentation.navigation.Screen;
import com.julian.multicalc.presentation.navigation.ViewRouter;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;

public class ShellController {

    @FXML
    private StackPane contentPane;

    private final ViewRouter viewRouter = new ViewRouter();

    @FXML
    private void initialize() {
        showScreen(Screen.CALCULATOR);
    }

    @FXML
    private void showCalculator() {
        showScreen(Screen.CALCULATOR);
    }

    @FXML
    private void showConversions() {
        showScreen(Screen.CONVERSIONS);
    }

    @FXML
    private void showCurrency() {
        showScreen(Screen.CURRENCY);
    }

    @FXML
    private void showHistory() {
        showScreen(Screen.HISTORY);
    }

    @FXML
    private void showSettings() {
        showScreen(Screen.SETTINGS);
    }

    private void showScreen(Screen screen) {
        contentPane.getChildren().setAll(viewRouter.load(screen));
    }
}