package com.julian.multicalc.presentation.navigation;

public enum Screen {
    CALCULATOR("/fxml/calculator.fxml"),
    CONVERSIONS("/fxml/conversions.fxml"),
    CURRENCY("/fxml/currency.fxml"),
    HISTORY("/fxml/history.fxml"),
    SETTINGS("/fxml/settings.fxml");

    private final String fxmlPath;

    Screen(String fxmlPath) {
        this.fxmlPath = fxmlPath;
    }

    public String getFxmlPath() {
        return fxmlPath;
    }
}