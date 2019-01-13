package gui;

import engine.CodeChooser;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class ColoringDots {

    private ArrayList<Integer> computerChoice;
    private static final String shape = " -fx-border-radius: 40; -fx-background-radius: 40;";
    private int one;
    private int two;
    private int three;
    private int four;

    private CodeChooser codeChooser;
    private ArrayList<Integer> computerTry;

    public ColoringDots(CodeChooser codeChooser, ArrayList<Integer> computerTry) {
        this.codeChooser = codeChooser;
        this.computerTry = computerTry;

    }

    private void choosenNumbers() {

        one = computerTry.get(0);
        two = computerTry.get(1);
        three = computerTry.get(2);
        four = computerTry.get(3);

    }


    public void setCompColor(Button firstOne, Button firstTwo, Button firstThree, Button firstFour) {

        choosenNumbers();
        firstOne.setStyle(shape + " -fx-background-color:" + codeChooser.setColor(one));
        firstTwo.setStyle(shape + " -fx-background-color:" + codeChooser.setColor(two));
        firstThree.setStyle(shape + " -fx-background-color:" + codeChooser.setColor(three));
        firstFour.setStyle(shape + " -fx-background-color:" + codeChooser.setColor(four));
    }


}
