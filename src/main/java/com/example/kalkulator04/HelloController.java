package com.example.kalkulator04;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;

public class HelloController {

    @FXML
    public TextField a1;
    @FXML
    private ResourceBundle resources;


    @FXML
    private TextField b1;

    @FXML
    private Pane fon;


    @FXML
    private Label otvet;

    @FXML
    private Label vvod;

    private void TEXT_ON() {
        fon.setOnKeyPressed(e -> {
            if (e.isControlDown() && e.getCode() == KeyCode.Q) {
                int a = Integer.parseInt(a1.getText());
                int b = Integer.parseInt(b1.getText());
                otvet.setText(String.valueOf(a + b));
            }
            if (e.getCode() == KeyCode.W) {
                int a = Integer.parseInt(a1.getText());
                int b = Integer.parseInt(b1.getText());
                otvet.setText(String.valueOf(a - b));
            }
            if (e.getCode() == KeyCode.E)
            {
                int a = Integer.parseInt(a1.getText());
                int b = Integer.parseInt(b1.getText());
                otvet.setText(String.valueOf(a * b));
            }
            if (e.getCode() == KeyCode.R)
            {
                double a = Double.parseDouble(a1.getText());
                double b = Double.parseDouble(b1.getText());
                otvet.setText(String.valueOf(a / b));
            }
        });

    }

    @FXML
    void k1(ActionEvent event) {
        int a = Integer.parseInt(a1.getText());
        int b = Integer.parseInt(b1.getText());
        otvet.setText(String.valueOf(a + b));
    }

    @FXML
    void k2(ActionEvent event) {
        int a = Integer.parseInt(a1.getText());
        int b = Integer.parseInt(b1.getText());
        otvet.setText(String.valueOf(a - b));
    }

    @FXML
    void k3(ActionEvent event) {
        int a = Integer.parseInt(a1.getText());
        int b = Integer.parseInt(b1.getText());
        otvet.setText(String.valueOf(a * b));
    }

    @FXML
    void k4(ActionEvent event) {
        double a = Double.parseDouble(a1.getText());
        double b = Double.parseDouble(b1.getText());
        otvet.setText(String.valueOf(a / b));
    }

    @FXML
    void initialize() {
        TEXT_ON();
    }

    @FXML
    public void close(ActionEvent event) {

        System.exit(0);
    }
}


