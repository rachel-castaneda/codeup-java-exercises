package util;

import java.util.ArrayList;

public class CodeupUtils {

    public static ArrayList<IndexPair> findAddends(ArrayList<Integer> listToTry, int target) {
        ArrayList<IndexPair> sums = new ArrayList<>();
        for (int i=0; i<listToTry.size()-1; i++) {
             for (int j = i+1; j<listToTry.size(); j++) {
                 int sum = listToTry.get(i) + listToTry.get(j);
                 if (sum == target) {
                     IndexPair ip = new IndexPair(i, j);
                     sums.add(ip);
                 }
             }
        }
        return sums;
    }

}
