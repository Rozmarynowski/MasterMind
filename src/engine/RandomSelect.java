package engine;

import javafx.scene.control.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class RandomSelect {

    private Random generator = new Random();
    private int n;
    private CodeChooser codeChooser;
    private static final String shape = " -fx-border-radius: 40; -fx-background-radius: 40;";
    private ArrayList<Integer> computerChoice = new ArrayList<Integer>();

    private int one;
    private int two;
    private int three;
    private int four;


    public RandomSelect(CodeChooser codeChooser) {
        this.codeChooser = codeChooser;
    }

    public void choosenNumbers(ArrayList<Integer> computerChoice) {

        one = computerChoice.get(0);
        two = computerChoice.get(1);
        three = computerChoice.get(2);
        four = computerChoice.get(3);

    }


    public void setCompColor(Button firstOne, Button firstTwo, Button firstThree, Button firstFour) {

        firstOne.setStyle(shape + " -fx-background-color:" + codeChooser.setColor(one));
        firstTwo.setStyle(shape + " -fx-background-color:" + codeChooser.setColor(two));
        firstThree.setStyle(shape + " -fx-background-color:" + codeChooser.setColor(three));
        firstFour.setStyle(shape + " -fx-background-color:" + codeChooser.setColor(four));
    }


    public ArrayList drawANumber() {


        while (computerChoice.size() != 4) {
            n = generator.nextInt(6) + 1;
            if (!computerChoice.contains(n)) {
                computerChoice.add(n);
            }
        }
        choosenNumbers(computerChoice);
        return computerChoice;
    }


}
