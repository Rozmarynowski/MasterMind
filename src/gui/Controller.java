package gui;

import engine.CodeChooser;
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
    private int click1Code = 0;
    private int click2Code = 0;
    private int click3Code = 0;
    private int click4Code = 0;


    CodeChooser codeChooser  = new CodeChooser();

    public void colorCodeFour(javafx.event.ActionEvent actionEvent) {

        if(click4Code >=6){ click4Code = 0;}

        click4Code++;

        while(click4Code == click1Code || click4Code == click2Code || click4Code == click3Code){
            click4Code = searchClick(click4Code);

        }


        codeFour.setStyle(shape +" -fx-background-color:"  + codeChooser.setColor(click4Code));




    }

    public void colorCodeThree(javafx.event.ActionEvent actionEvent) {

        if(click3Code >= 6){ click3Code = 0;}

            click3Code++;
        while(click3Code == click1Code || click3Code == click2Code || click3Code == click4Code){
            click3Code = searchClick(click3Code);

        }

        coderThree.setStyle(shape +" -fx-background-color:"  + codeChooser.setColor(click3Code));

    }

    public void colorCodeTwo(javafx.event.ActionEvent actionEvent) {

        if(click2Code >=6){ click2Code = 0;}

        click2Code++;

        while(click2Code == click1Code || click2Code == click3Code || click2Code == click4Code){
            click2Code = searchClick(click2Code);

        }

        coderTwo.setStyle(shape +" -fx-background-color:"  + codeChooser.setColor(click2Code));


    }

    public void colorCodeOne(javafx.event.ActionEvent actionEvent) {


        if(click1Code >=6){ click1Code = 0;}
        click1Code++;

        while(click1Code == click2Code || click1Code == click3Code || click1Code == click4Code){
            click1Code = searchClick(click1Code);
        }

        coderOne.setStyle(shape +" -fx-background-color:"  + codeChooser.setColor(click1Code));

    }

    public int searchClick(int click){

        if(click >=6){ click = 0;}
        click++;
        System.out.println(click);

        return click;
    }
}
