package engine;

import java.util.ArrayList;
import java.util.Arrays;

public class Capabilities {
    private CheckingClass checkingClass;
    private ArrayList<int[]> variation;
    private   ArrayList<Integer> possibilityCode = new ArrayList<>();
    private ArrayList<int[]> newList = new ArrayList<>();


    public Capabilities(CheckingClass checkingClass, ArrayList<int[]> variation) {
        this.checkingClass = checkingClass;
        this.variation = variation;
    }

    public void setVariation(ArrayList<int[]> variation) {
        this.variation = variation;
    }

    public ArrayList<int[]> getVariation() {
        return variation;
    }

    /**
     *The method searches the list of all items and searches for which the key meets
     */

    public void searchForMatching() {

        newList.clear();
        clearGameCode();

        int positionKey = checkingClass.getPositionCounter();
        int colorKey = Math.abs(positionKey - checkingClass.getColorCounter());

        System.out.println("KLUCZ GŁÓWNY " + positionKey + " " + colorKey);

        checkingClass.setGameCode(checkingClass.getComputerTry());

        for (int i = 0; i < variation.size(); i++) {
            for (int j = 0; j < 4; j++) {
                possibilityCode.set(j, variation.get(i)[j]);
            }

            int posibilityPositionKey = checkingClass.checkingPositions(possibilityCode);
            int posibilityColorKey =Math.abs(posibilityPositionKey - checkingClass.checkingColors(possibilityCode));

            if (posibilityPositionKey == positionKey && posibilityColorKey == colorKey) {
                        newList.add(variation.get(i));
            }
    }

        for(int a = 0; a<newList.size();a++)
            System.out.println("NOWA LISTA " + Arrays.toString(newList.get(a)) + "     KLUCZ " + positionKey + " " + colorKey);

            System.out.println("ROZMIAR PO ALGORYTMIE " + newList.size());

        variation = (ArrayList<int[]>) newList.clone();
    }

    private void clearGameCode(){

        while (possibilityCode.size()<4){
            possibilityCode.add(0);
        }
    }
}
