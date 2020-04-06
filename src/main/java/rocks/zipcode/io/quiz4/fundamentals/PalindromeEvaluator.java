package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {

        Set<String> list = new HashSet<>();
        for (float pivot = 0; pivot < string.length(); pivot += .5) {
            float palindromeRadius = pivot - (int)pivot;
            while ((pivot + palindromeRadius) < string.length()
                    && (pivot - palindromeRadius) >= 0
                    && string.charAt((int)(pivot - palindromeRadius))
                    == string.charAt((int)(pivot + palindromeRadius))) {

                list.add(string.substring((int)(pivot - palindromeRadius),
                        (int)(pivot + palindromeRadius + 1)));
                palindromeRadius++;
            }
        }String[] arr = new String[list.size()];

        return list.toArray(arr);
    }

    public static Boolean isPalindrome(String string) {
        String compare = "";
        StringBuilder stringBuilder = new StringBuilder(string);
        compare += stringBuilder.reverse();
        if (compare.equals(string)){
        return true;
        }return false;
    }

    public static String reverseString(String string) {
        String reverse = "";
        StringBuilder reverser = new StringBuilder(string);
        reverse += reverser.reverse();
        return reverse;
    }
}
