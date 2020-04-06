package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> set = new HashSet<>();
        String[] arr;
        String toBeSplit = "";
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                if (!string.substring(i,j).equals(" "))
                    toBeSplit += (string.substring(i,j) +",");
                }
        }

        arr = toBeSplit.split(",");


        return arr;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        Set<String> set = new HashSet<>();
        String[] first = getAllSubstrings(string1);
        String[] second = getAllSubstrings(string2);
        for (int i = 0; i < string2.length(); i++) {
            if (first[i].equals(second[i])){
                set.add(first[i]);
            }

        }
        Object[] transfer = set.toArray();
        String[] result = new String[transfer.length];
        for (int i = 0; i < transfer.length ; i++) {
            result[i] += transfer[i];
        }

        return result;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        return null;
    }
}
