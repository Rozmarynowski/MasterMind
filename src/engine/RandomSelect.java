package engine;

import java.util.ArrayList;
import java.util.Random;

public class RandomSelect {

    private Random generator = new Random();
    private int n;

    private Capabilities capabilities;

    private ArrayList<Integer> computerChoice = new ArrayList<>();
    private ArrayList<int[]> variations = new ArrayList<>();

    public RandomSelect(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    public ArrayList drawANumber() {
        int[] tab;
        int i = 0;

        clearComputerChoice();
        variations = capabilities.getVariation();
        try {

        n = generator.nextInt(variations.size() + 1);
        }catch (ArrayIndexOutOfBoundsException ex){
        System.out.println("WYJĄTEK 1");
        n=1;
        }

        try{
            tab = variations.get(n-1);
        }catch (ArrayIndexOutOfBoundsException ex2){
            System.out.println("WYJĄTEK 2");
            n=1;
            tab = variations.get(n-1);
        }



        while (i != 4) {
            computerChoice.set(i, tab[i]);
            i++;
        }

        variations.remove(n - 1);
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
