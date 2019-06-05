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

    /**
     * The method checks if the colors of the player's code match the computer's code
     * @param computerTry - one table with four elements.
     * @return colorCounter - number of matching numbers in the array and key.
     */
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

    /**
     * The method checks if the position of the player's code match the computer's code
     * @param computerTry one table with four elements.
     * @return - number of matching numbers in the array and key.
     */

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

    /**
     * The method returns last number of matching colors.
     * @return colorCounter - number of matching numbers in the array and key.
     */
    public int getColorCounter() {
        return colorCounter;
    }
    /**
     * The method returns last number of matching positions.
     * @return positionCounter - number of matching numbers in the array and key.
     */
    public int getPositionCounter() {
        return positionCounter;
    }

    /**
     * The method sets gameCode coded by player.
     * @param gameCode - lists of numbers coded by player.
     */
    public void setGameCode(ArrayList<Integer> gameCode) {
        this.gameCode = gameCode;
    }
    /**
     * The method sets computerTry drawn by computer.
     * @param computerTry - lists of numbers drawn by computer.
     */
    public void setComputerTry(ArrayList<Integer> computerTry) {
        this.computerTry = computerTry;
    }

    public void checkingListener(){
        checkingColors(computerTry);
        checkingPositions(computerTry);
    }

    /**
     *
     * @return computerTry - lists of last numbers drawn by computer.
     */
    public ArrayList<Integer> getComputerTry() {
        return computerTry;
    }




}