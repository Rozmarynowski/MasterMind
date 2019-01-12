package engine;

import java.util.ArrayList;
import java.util.HashSet;

public class BaseOfResults {

    public static HashSet<int []> mainHashSet = new HashSet<>();
    ArrayList<int[]> variation = new ArrayList<>();

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
            //  System.out.format("%d,%d,%d,%d \n",item[0],item[1],item[2],item[3]);
            int[] a = {item[0],item[1],item[2],item[3]};
            variation.add(a);
        });
       // System.out.println(Arrays.toString(variation.get(0)));

       // System.out.println(mainHashSet.size());


    return variation;

    }


}
