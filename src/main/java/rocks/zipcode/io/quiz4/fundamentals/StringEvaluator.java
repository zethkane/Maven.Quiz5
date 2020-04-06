package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                    set.add(string.substring(i,j));
                }
        }
        String[] arr = new String[set.size()];
        set.toArray(arr);


        return arr;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        Set<String> set = new HashSet<>();
        String[] first = getAllSubstrings(string1);
        String[] second = getAllSubstrings(string2);
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length ; j++) {
                if (first[i].equals(second[j])){
                set.add(first[i]);
                }
            }
        }
        String[] result = new String[set.size()];
        set.toArray(result);

        return result;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String largest = "";
        String[] allCommon = getCommonSubstrings(string1, string2);
        for (int i = 0; i < allCommon.length - 1; i++) {
            if (allCommon[i].length() > allCommon[i+1].length()){
                largest = allCommon[i];
            }
        }
        return largest;
    }
}
