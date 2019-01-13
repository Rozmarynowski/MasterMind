package gui;

import engine.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class Controller implements Initializable {

    @FXML
    private Button thirdOne;
    @FXML
    private Button thirdTwo;
    @FXML
    private Button thirdThree;
    @FXML
    private Button thirdFour;
    @FXML
    private Button secondOne;
    @FXML
    private Button secondTwo;
    @FXML
    private Button secondThree;
    @FXML
    private Button secondFour;
    @FXML
    private Button firstEvaluate1;
    @FXML
    private Button firstEvaluate3;
    @FXML
    private Button firstEvaluate2;
    @FXML
    private Button firstEvaluate4;
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
    private boolean pressStartBtn = true;
    private ArrayList<Integer> coderList = new ArrayList();
    private ArrayList<int[]> variation;
    private int round = 0;

    private BaseOfResults baseOfResults = new BaseOfResults();
    private CodeChooser codeChooser = new CodeChooser();
    private ColoringDots coloringDots;

    private RandomSelect randomSelect;
    private CheckingClass checkingClass;
    private Capabilities capabilities;

    public void colorCodeFour(javafx.event.ActionEvent actionEvent) {

        if (pressStartBtn) {
            if (click4Code >= 6) {
                click4Code = 0;
            }

            click4Code++;

            while (click4Code == click1Code || click4Code == click2Code || click4Code == click3Code) {
                click4Code = CodeChooser.searchClick(click4Code);

            }


            codeFour.setStyle(shape + " -fx-background-color:" + codeChooser.setColor(click4Code));
            codeFour.setText("");
            coderList.set(3, click4Code);

        }
    }

    public void colorCodeThree(javafx.event.ActionEvent actionEvent) {

        if (pressStartBtn) {
            if (click3Code >= 6) {
                click3Code = 0;
            }

            click3Code++;
            while (click3Code == click1Code || click3Code == click2Code || click3Code == click4Code) {
                click3Code = CodeChooser.searchClick(click3Code);

            }

            coderThree.setStyle(shape + " -fx-background-color:" + codeChooser.setColor(click3Code));
            coderThree.setText("");
            coderList.set(2, click3Code);

        }
    }

    public void colorCodeTwo(javafx.event.ActionEvent actionEvent) {
        if (pressStartBtn) {
            if (click2Code >= 6) {
                click2Code = 0;
            }

            click2Code++;

            while (click2Code == click1Code || click2Code == click3Code || click2Code == click4Code) {
                click2Code = CodeChooser.searchClick(click2Code);

            }

            coderTwo.setStyle(shape + " -fx-background-color:" + codeChooser.setColor(click2Code));
            coderTwo.setText("");
            coderList.set(1, click2Code);

        }
    }

    public void colorCodeOne(javafx.event.ActionEvent actionEvent) {

        if (pressStartBtn) {
            if (click1Code >= 6) {
                click1Code = 0;
            }
            click1Code++;

            while (click1Code == click2Code || click1Code == click3Code || click1Code == click4Code) {
                click1Code = CodeChooser.searchClick(click1Code);
            }

            coderOne.setStyle(shape + " -fx-background-color:" + codeChooser.setColor(click1Code));
            coderOne.setText("");
            coderList.set(0, click1Code);
        }

    }


    public void pressPlatBtn(ActionEvent actionEvent) throws InterruptedException {
        round++;
        ArrayList<Integer> computerTry;


        randomSelect = new RandomSelect(codeChooser, capabilities);
        computerTry = randomSelect.drawANumber();
        pressStartBtn = false;
        System.out.println("Controller|ComputerTry: " + computerTry);
        //turnOffButton(playBtn);

        System.out.println("Controller|Coded: " + coderList);

        coloringDots = new ColoringDots(codeChooser, computerTry);
        chooseLine(round);

        checkingClass.setGameCode(coderList);
        checkingClass.setComputerTry(computerTry);
        checkingClass.checkingListener();
        checkingClass.ratingAnswer_color(firstEvaluate1, firstEvaluate2, firstEvaluate3, firstEvaluate4);
        checkingClass.ratingAnswer_position(firstEvaluate1, firstEvaluate2, firstEvaluate3, firstEvaluate4);


        capabilities.searchForMatching();

    }

    public void turnOffButton(Button button) {

        button.setDisable(true);


    }

    private void chooseLine(int round2) {


        switch (round2) {
            case 1:
                coloringDots.setCompColor(firstOne, firstTwo, firstThree, firstFour);
                break;
            case 2:
                coloringDots.setCompColor(secondOne, secondTwo, secondThree, secondFour);
                break;
            case 3:
                coloringDots.setCompColor(thirdOne, thirdTwo, thirdThree, thirdFour);
                break;
            case 4:
              //  coloringDots.setCompColor(secondOne, secondTwo, secondThree, secondFour);
                break;
            case 5:
               // coloringDots.setCompColor(secondOne, secondTwo, secondThree, secondFour);
                break;
            case 6:
              //  coloringDots.setCompColor(secondOne, secondTwo, secondThree, secondFour);
                break;
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for (int i = 0; i < 4; i++) {
            coderList.add(0);
        }
        variation = baseOfResults.getList();

        checkingClass = new CheckingClass(colors);
        capabilities = new Capabilities(checkingClass, randomSelect, variation);


    }
}

