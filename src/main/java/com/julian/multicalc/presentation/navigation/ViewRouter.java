package com.julian.multicalc.presentation.navigation;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

public class ViewRouter {

    public Parent load(Screen screen) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(screen.getFxmlPath()));
            return loader.load();
        } catch (IOException e) {
            throw new RuntimeException("No se pudo cargar la vista: " + screen, e);
        }
    }
}
