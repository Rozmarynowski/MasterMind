package engine;

import java.util.ArrayList;
import java.util.Arrays;

public class Capabilities {
    private CheckingClass checkingClass;
    private RandomSelect randomSelect;
    private ArrayList<int[]> variation;
    private   ArrayList<Integer> possibilityCode = new ArrayList<>();
    private ArrayList<int[]> code = new ArrayList<int[]>();



    public Capabilities(CheckingClass checkingClass, RandomSelect randomSelect, ArrayList<int[]> variation) {
        this.checkingClass = checkingClass;
        this.randomSelect = randomSelect;
        this.variation = variation;
    }

    public void setVariation(ArrayList<int[]> variation) {
        this.variation = variation;
    }

    public ArrayList<int[]> getVariation() {
        return variation;
    }


    public void searchForMatching() {

        System.out.println("ROZMIAR WAR " + variation.size());
        clearGameCode();

        int positionKey = checkingClass.getPositionCounter();
        int colorKey = Math.abs(positionKey - checkingClass.getColorCounter());

        checkingClass.setGameCode( checkingClass.getComputerTry());


        for (int i = 0; i < variation.size() - 1; i++) {
            for (int j = 0; j < 4; j++) {
                possibilityCode.set(j, variation.get(i)[j]);
            }

            int posibilityPositionKey = checkingClass.checkingPositions(possibilityCode);
            int posibilityColorKey = Math.abs(posibilityPositionKey - checkingClass.checkingColors(possibilityCode));


                if (posibilityPositionKey != positionKey && posibilityColorKey != colorKey) {

                    variation.remove(i);
            }

    }
        for(int a = 0; a<variation.size();a++)
            System.out.println("NOWA LISTA " + Arrays.toString(variation.get(a)));


        System.out.println("ROZMIAR WAR PO " + variation.size());



    }

    private void clearGameCode(){

        while (possibilityCode.size()<4){
            possibilityCode.add(0);
        }

    }





}
