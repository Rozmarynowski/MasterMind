package gui;

import engine.CheckingClass;
import engine.CodeChooser;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class ColoringDots {

    private static final String shape = " -fx-border-radius: 40; -fx-background-radius: 40;";
    private int one;
    private int two;
    private int three;
    private int four;
    private int colorCounter;
    private int positionCounter;
    private Button button;
    private CheckingClass checkingClass;
    private CodeChooser codeChooser;
    private ArrayList<Integer> computerTry;

    public ColoringDots(CodeChooser codeChooser,CheckingClass checkingClass, ArrayList<Integer> computerTry) {
        this.codeChooser = codeChooser;
        this.computerTry = computerTry;
        this.checkingClass = checkingClass;

    }

    private void choosenNumbers() {

        one = computerTry.get(0);
        two = computerTry.get(1);
        three = computerTry.get(2);
        four = computerTry.get(3);

    }

    /**
     * The Method colors buttons clicked by player to choose a code.
     * @param firstOne
     * @param firstTwo
     * @param firstThree
     * @param firstFour
     */
    public void setCompColor(Button firstOne, Button firstTwo, Button firstThree, Button firstFour) {

        choosenNumbers();
        firstOne.setStyle(shape + " -fx-background-color:" + codeChooser.setColor(one));
        firstTwo.setStyle(shape + " -fx-background-color:" + codeChooser.setColor(two));
        firstThree.setStyle(shape + " -fx-background-color:" + codeChooser.setColor(three));
        firstFour.setStyle(shape + " -fx-background-color:" + codeChooser.setColor(four));
    }

    private void goodColorPainting(Button button) {

        button.setStyle(shape + " -fx-background-color:" + codeChooser.setColor(7));

    }

    private void goodPositionPainting(Button button) {

        button.setStyle(shape + " -fx-background-color:" + codeChooser.setColor(8));

    }

    /**
     * The Method colored tags on corresponding colors to the drawn numbers by computer.
     * @param firstEvaluate1
     * @param firstEvaluate2
     * @param firstEvaluate3
     * @param firstEvaluate4
     */
    public void ratingAnswer_color(Button firstEvaluate1, Button firstEvaluate2, Button firstEvaluate3, Button firstEvaluate4) {

        colorCounter = checkingClass.getColorCounter();

        switch (colorCounter) {

            case 1:
                goodColorPainting(firstEvaluate1);

                break;
            case 2:
                goodColorPainting(firstEvaluate1);
                goodColorPainting(firstEvaluate2);
                break;
            case 3:
                goodColorPainting(firstEvaluate1);
                goodColorPainting(firstEvaluate2);
                goodColorPainting(firstEvaluate3);
                break;
            case 4:
                goodColorPainting(firstEvaluate1);
                goodColorPainting(firstEvaluate2);
                goodColorPainting(firstEvaluate3);
                goodColorPainting(firstEvaluate4);
                break;
        }

    }

    /**
     * The Method colored tags on corresponding positions to the drawn numbers by computer.
     * @param firstEvaluate1
     * @param firstEvaluate2
     * @param firstEvaluate3
     * @param firstEvaluate4
     */
    public void ratingAnswer_position(Button firstEvaluate1, Button firstEvaluate2, Button firstEvaluate3, Button firstEvaluate4) {

        positionCounter = checkingClass.getPositionCounter();

        switch (positionCounter) {

            case 1:
                goodPositionPainting(firstEvaluate1);
                break;
            case 2:
                goodPositionPainting(firstEvaluate1);
                goodPositionPainting(firstEvaluate2);
                break;
            case 3:
                goodPositionPainting(firstEvaluate1);
                goodPositionPainting(firstEvaluate2);
                goodPositionPainting(firstEvaluate3);

                break;
            case 4:
                goodPositionPainting(firstEvaluate1);
                goodPositionPainting(firstEvaluate2);
                goodPositionPainting(firstEvaluate3);
                goodPositionPainting(firstEvaluate4);

                break;
        }
    }
   }
