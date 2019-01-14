package engine;


import java.util.ArrayList;

public class CheckingClass {

    private ArrayList<Integer> gameCode = new ArrayList<>();
    private ArrayList<Integer> computerTry = new ArrayList<>();

    private int colorCounter = 0;
    private int positionCounter = 0;
    private Colors colors;

    public CheckingClass(Colors colors) {
        this.colors = colors;
    }

    public int checkingColors(ArrayList<Integer> computerTry) {
        this.computerTry = computerTry;
        colorCounter = 0;
        for (int i = 0; i < 4; i++) {

            if (gameCode.contains(computerTry.get(i))) {
                colorCounter++;
            }
        }

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
        return positionCounter;
    }

    public int getColorCounter() {
        return colorCounter;
    }

    public int getPositionCounter() {
        return positionCounter;
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