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
    private Button fifthEvaluate1;
    @FXML
    private Button fifthEvaluate3;
    @FXML
    private Button fifthEvaluate2;
    @FXML
    private Button fifthEvaluate4;
    @FXML
    private Button sixthEvaluate1;
    @FXML
    private Button sixthEvaluate3;
    @FXML
    private Button sixthEvaluate2;
    @FXML
    private Button sixthEvaluate4;
    @FXML
    private Button fourthEvaluate1;
    @FXML
    private Button fourthEvaluate3;
    @FXML
    private Button fourthEvaluate2;
    @FXML
    private Button fourthEvaluate4;
    @FXML
    private Button thirdEvaluate1;
    @FXML
    private Button thirdEvaluate3;
    @FXML
    private Button thirdEvaluate2;
    @FXML
    private Button thirdEvaluate4;
    @FXML
    private Button secondEvaluate1;
    @FXML
    private Button secondEvaluate3;
    @FXML
    private Button secondEvaluate2;
    @FXML
    private Button secondEvaluate4;
    @FXML
    private Button fourthOne;
    @FXML
    private Button fourthTwo;
    @FXML
    private Button fourthThree;
    @FXML
    private Button fourthFour;
    @FXML
    private Button fifthOne;
    @FXML
    private Button fifthTwo;
    @FXML
    private Button fifthThree;
    @FXML
    private Button fifthFour;
    @FXML
    private Button sixthOne;
    @FXML
    private Button sixthTwo;
    @FXML
    private Button sixthThree;
    @FXML
    private Button sixthFour;
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
    private ArrayList coderList = new ArrayList();
    private int round = 0;

    private BaseOfResults baseOfResults = new BaseOfResults();
    private CodeChooser codeChooser = new CodeChooser();
    private ColoringDots coloringDots;

    private RandomSelect randomSelect;
    private CheckingClass checkingClass;
    private Capabilities capabilities;

    /**
     * The method responsible for selecting the code for fourth of four items by clicking by player.
     * @param actionEvent
     */
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
            checkCode();

        }
    }
    /**
     * The method responsible for selecting the code for third of four items by clicking by player.
     * @param actionEvent
     */
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
            checkCode();

        }
    }
    /**
     * The method responsible for selecting the code for second of four items by clicking by player.
     * @param actionEvent
     */
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
            checkCode();

        }
    }
    /**
     * The method responsible for selecting the code for first of four items by clicking by player.
     * @param actionEvent
     */
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
            checkCode();
        }
    }

    /**
     * The method performs computer movement by player's clicks
     * @param actionEvent
     */
    public void pressPlatBtn(ActionEvent actionEvent) {
        ArrayList computerTry;

        round++;

        if (round == 1) {
            randomSelect = new RandomSelect(capabilities);
        }

        computerTry = randomSelect.drawANumber();

        System.out.println("Controller|ComputerTry: " + computerTry);

        System.out.println("Controller|Coded: " + coderList);

        coloringDots = new ColoringDots(codeChooser, checkingClass, computerTry);
        if (computerTry.equals(coderList)) {
            turnOffButton(playBtn);
        }

        checkingClass.setGameCode(coderList);
        checkingClass.setComputerTry(computerTry);
        checkingClass.checkingListener();
        chooseLine(round);
        capabilities.searchForMatching();

    }


    private void turnOffButton(Button button) {
        button.setDisable(true);
    }

    /**
     * The method selects a coloring line depending on the round
     * @param round
     */
    private void chooseLine(int round) {


        switch (round) {
            case 1:
                coloringDots.setCompColor(firstOne, firstTwo, firstThree, firstFour);
                coloringDots.ratingAnswer_color(firstEvaluate1, firstEvaluate2, firstEvaluate3, firstEvaluate4);
                coloringDots.ratingAnswer_position(firstEvaluate1, firstEvaluate2, firstEvaluate3, firstEvaluate4);
                break;
            case 2:
                coloringDots.setCompColor(secondOne, secondTwo, secondThree, secondFour);
                coloringDots.ratingAnswer_color(secondEvaluate1, secondEvaluate2, secondEvaluate3, secondEvaluate4);
                coloringDots.ratingAnswer_position(secondEvaluate1, secondEvaluate2, secondEvaluate3, secondEvaluate4);
                break;
            case 3:
                coloringDots.setCompColor(thirdOne, thirdTwo, thirdThree, thirdFour);
                coloringDots.ratingAnswer_color(thirdEvaluate1, thirdEvaluate2, thirdEvaluate3, thirdEvaluate4);
                coloringDots.ratingAnswer_position(thirdEvaluate1, thirdEvaluate2, thirdEvaluate3, thirdEvaluate4);
                break;
            case 4:
                coloringDots.setCompColor(fourthOne, fourthTwo, fourthThree, fourthFour);
                coloringDots.ratingAnswer_color(fourthEvaluate1, fourthEvaluate2, fourthEvaluate3, fourthEvaluate4);
                coloringDots.ratingAnswer_position(fourthEvaluate1, fourthEvaluate2, fourthEvaluate3, fourthEvaluate4);
                break;
            case 5:
                coloringDots.setCompColor(fifthOne, fifthTwo, fifthThree, fifthFour);
                coloringDots.ratingAnswer_color(fifthEvaluate1, fifthEvaluate2, fifthEvaluate3, fifthEvaluate4);
                coloringDots.ratingAnswer_position(fifthEvaluate1, fifthEvaluate2, fifthEvaluate3, fifthEvaluate4);

                break;
            case 6:
                coloringDots.setCompColor(sixthOne, sixthTwo, sixthThree, sixthFour);
                coloringDots.ratingAnswer_color(sixthEvaluate1, sixthEvaluate2, sixthEvaluate3, sixthEvaluate4);
                coloringDots.ratingAnswer_position(sixthEvaluate1, sixthEvaluate2, sixthEvaluate3, sixthEvaluate4);
                break;
        }

    }

    private void checkCode() {
        if (click1Code != 0 && click2Code != 0 && click3Code != 0 && click4Code != 0) {
            playBtn.setDisable(false);
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for (int i = 0; i < 4; i++) {
            coderList.add(0);
        }
        ArrayList variation = baseOfResults.getList();

        checkingClass = new CheckingClass(colors);
        capabilities = new Capabilities(checkingClass, variation);
        turnOffButton(playBtn);
    }
}


