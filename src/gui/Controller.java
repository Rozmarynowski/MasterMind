package gui;

import engine.Colors;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.awt.event.ActionEvent;

public class Controller {

    @FXML
    private Button coderOne;

    @FXML
    private Button coderTwo;

    @FXML
    private Button coderThree;

    @FXML
    private Button codeFour;

    Colors colors;
    private static final String shape = " -fx-border-radius: 40; -fx-background-radius: 40;";


    public void colorCodeFour(javafx.event.ActionEvent actionEvent) {

        codeFour.setStyle(shape +" -fx-background-color:"  + colors.PINK.getColorName());

    }

    public void colorCodeThree(javafx.event.ActionEvent actionEvent) {
    }

    public void colorCodeTwo(javafx.event.ActionEvent actionEvent) {
    }

    public void colorCodeOne(javafx.event.ActionEvent actionEvent) {
    }
}
