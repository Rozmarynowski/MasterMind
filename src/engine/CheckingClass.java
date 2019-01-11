package engine;

import java.util.ArrayList;

public class CheckingClass {

    private ArrayList<Integer> gameCode = new ArrayList<>();
    private ArrayList<Integer> computerTry = new ArrayList<>();
    private int codedOne;
    private int codedTwo;
    private int codedThree;
    private int codedFour;
    private int tryOne;
    private int tryTwo;
    private int tryThree;
    private int tryFour;
    private int i = 0;


    public CheckingClass(ArrayList<Integer> gameCode, ArrayList<Integer> computerTry) {
        this.gameCode = gameCode;
        this.computerTry = computerTry;
        assignValues();
    }

    private void assignValues(){

        codedOne = unpackGameCode(0);
        codedTwo = unpackGameCode(1);
        codedThree = unpackGameCode(2);
        codedFour = unpackGameCode(3);
        System.out.println(codedOne);

        tryOne = unpackComputerTry(0);
        tryTwo = unpackComputerTry(1);
        tryThree = unpackComputerTry(2);
        tryFour = unpackComputerTry(3);
        System.out.println(tryOne);

    }

    private int unpackGameCode(int i) {

       int n;
       n = gameCode.get(i);

        return n;
    }
    private int unpackComputerTry(int i) {

        int m;
        m = computerTry.get(i);

        return m;



    }
}