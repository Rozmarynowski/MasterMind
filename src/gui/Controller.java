package gui;

import engine.CheckingClass;
import engine.CodeChooser;
import engine.Colors;
import engine.RandomSelect;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button firstOne;
    @FXML
    private Button firstTwo;
    @FXML
    private Button firstThree;
    @FXML
    private Button firstFour;
    @FXML
    private Button playBtn;
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
    private ArrayList<Integer> coderList= new ArrayList();

    CodeChooser codeChooser  = new CodeChooser();
    RandomSelect randomSelect;
    CheckingClass checkingClass;

    public void colorCodeFour(javafx.event.ActionEvent actionEvent) {


        if(click4Code >=6){ click4Code = 0;}

        click4Code++;

        while(click4Code == click1Code || click4Code == click2Code || click4Code == click3Code){
            click4Code = CodeChooser.searchClick(click4Code);

        }


        codeFour.setStyle(shape +" -fx-background-color:"  + codeChooser.setColor(click4Code));
        coderList.set(3,click4Code);

    }

    public void colorCodeThree(javafx.event.ActionEvent actionEvent) {

        if(click3Code >= 6){ click3Code = 0;}

            click3Code++;
        while(click3Code == click1Code || click3Code == click2Code || click3Code == click4Code){
            click3Code = CodeChooser.searchClick(click3Code);

        }

        coderThree.setStyle(shape +" -fx-background-color:"  + codeChooser.setColor(click3Code));
        coderList.set(2,click3Code);

    }

    public void colorCodeTwo(javafx.event.ActionEvent actionEvent) {

        if(click2Code >=6){ click2Code = 0;}

        click2Code++;

        while(click2Code == click1Code || click2Code == click3Code || click2Code == click4Code){
            click2Code = CodeChooser.searchClick(click2Code);

        }

        coderTwo.setStyle(shape +" -fx-background-color:"  + codeChooser.setColor(click2Code));
        coderList.set(1,click2Code);


    }

    public void colorCodeOne(javafx.event.ActionEvent actionEvent) {


        if(click1Code >=6){ click1Code = 0;}
        click1Code++;

        while(click1Code == click2Code || click1Code == click3Code || click1Code == click4Code){
            click1Code = CodeChooser.searchClick(click1Code);
        }

        coderOne.setStyle(shape +" -fx-background-color:"  + codeChooser.setColor(click1Code));
        coderList.set(0,click1Code);


    }


    public void pressPlatBtn(ActionEvent actionEvent) {

        randomSelect = new RandomSelect(codeChooser);
        randomSelect.drawANumber();
        randomSelect.setCompColor(firstOne,firstTwo,firstThree,firstFour);

        turnOffButton(coderOne);
        turnOffButton(coderTwo);
        turnOffButton(coderThree);
        turnOffButton(codeFour);
        turnOffButton(playBtn);

        System.out.println(coderList);
        System.out.println(randomSelect.drawANumber());

        checkingClass = new CheckingClass(coderList,randomSelect.drawANumber());




    }

    public void turnOffButton(Button button){

        button.setDisable(true);


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

       for (int i = 0;i<4;i++){
           coderList.add(0);
           System.out.println(coderList);
       }

    }
}
