package engine;

import javafx.scene.control.Button;

import java.util.ArrayList;

public class CheckingClass {

    private static final String shape = " -fx-border-radius: 40; -fx-background-radius: 40;";
    private ArrayList<Integer> gameCode = new ArrayList<>();
    private ArrayList<Integer> computerTry = new ArrayList<>();
    ArrayList<Integer> key = new ArrayList<>();

    private int codedOne;
    private int codedTwo;
    private int codedThree;
    private int codedFour;
    private int tryOne;
    private int tryTwo;
    private int tryThree;
    private int tryFour;

    private int colorCounter = 0;
    private int positionCounter = 0;
    private Colors colors;


    public CheckingClass(Colors colors) {
        this.colors = colors;
        //  assignValues();
    }

    private void assignValues() {

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

    public int checkingColors(ArrayList<Integer> computerTry) {
        this.computerTry = computerTry;
        colorCounter = 0;
        for (int i = 0; i < 4; i++) {

            if (gameCode.contains(computerTry.get(i))) {
                colorCounter++;
            }
        }

      //  System.out.println("Same colors: " + colorCounter);
        return colorCounter;
    }


    public int checkingPositions(ArrayList<Integer> computerTry) {
        this.computerTry = computerTry;
        positionCounter = 0;

        for (int i = 0; i < 4; i++) {

            if (gameCode.get(i) == computerTry.get(i)) {
                positionCounter++;
            }

        }
       // System.out.println("Same positions: " + positionCounter);
        return positionCounter;
    }





    public int getColorCounter() {
        return colorCounter;
    }

    public int getPositionCounter() {
        return positionCounter;
    }

    public void setColorCounter(int colorCounter) {
        this.colorCounter = colorCounter;
    }

    public void setPositionCounter(int positionCounter) {
        this.positionCounter = positionCounter;
    }

    public ArrayList<Integer> getGameCode() {
        return gameCode;
    }

    public void setGameCode(ArrayList<Integer> gameCode) {
        this.gameCode = gameCode;
    }

    public void setComputerTry(ArrayList<Integer> computerTry) {
        this.computerTry = computerTry;

    }

    public void checkingListener(){
        checkingColors(computerTry);
        checkingPositions(computerTry);
    }

    public ArrayList<Integer> getComputerTry() {
        return computerTry;
    }




}