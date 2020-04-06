package rocks.zipcode.io.quiz4.fundamentals;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {

        return null;
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
