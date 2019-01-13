package engine;

import javafx.scene.control.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomSelect {

    private Random generator = new Random();
    private int n;

    private CodeChooser codeChooser;
    private Capabilities capabilities;


    private ArrayList<Integer> computerChoice = new ArrayList<Integer>();
    private ArrayList<int[]> variations = new ArrayList<>();



    public RandomSelect(CodeChooser codeChooser, Capabilities capabilities) {
        this.codeChooser = codeChooser;
        this.capabilities = capabilities;
    }


    public ArrayList drawANumber() {
        int[] tab;
        int i = 0;

        clearComputerChoice();
        variations = capabilities.getVariation();

        n = generator.nextInt(variations.size() - 1);

        tab = variations.get(n);

        while (i != 4) {
            computerChoice.set(i, tab[i]);
            i++;
        }
        variations.remove(n);

        capabilities.setVariation(variations);

        return computerChoice;
    }

    public ArrayList<Integer> getComputerChoice() {
        return computerChoice;
    }

    private void clearComputerChoice() {

        while (computerChoice.size() < 4) {
            computerChoice.add(0);
        }
    }
}
