package engine;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *The class creates a list of 360 four-element tables from numbers 1,2,3,4,5,6.
 */
public class BaseOfResults {

    public static HashSet<int []> mainHashSet = new HashSet<>();
    ArrayList<int[]> variation = new ArrayList<>();

    /**
     * The method creates arraylist of 360 four-element tables from numbers 1,2,3,4,5,6.
     * @return arraylisto of 360 tables
     */
    public ArrayList getList() {

        int [] table = {1,2,3,4,5,6};
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j <table.length ; j++) {
                for (int k = 0; k <table.length ; k++) {
                    for (int l = 0; l < table.length ; l++) {
                        int [] hashTab = {table[l],table[k],table[j],table[i]}; //nowa dowolna tablica
                        HashSet<Integer> hashSetSmall = new HashSet<>();
                        for (int m = 0; m <hashTab.length ; m++) {
                            hashSetSmall.add(hashTab[m]);
                        }
                        if (hashSetSmall.size()!=hashTab.length) continue; //sprawdzam czy w tablicy nie ma powtórzeń, jeśli tak to wracam do wyższego fora

                        mainHashSet.add(hashTab);
                    }
                }
            }
        }

        mainHashSet.forEach(item->{
            int[] a = {item[0],item[1],item[2],item[3]};
            variation.add(a);
        });

    return variation;

    }


}
