package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    private String input;
    public PalindromeObject(String input) {
        this.input = input;
    }

    public String[] getAllPalindromes(){
        return PalindromeEvaluator.getAllPalindromes(input);
    }

    public Boolean isPalindrome(){
        if (reverseString().equals(input)){
            return true;
        }
        return false;
    }

    public String reverseString(){
        String reversed = "";
        StringBuilder reverser = new StringBuilder(input);;
        reversed += reverser.reverse();
        return reversed;
    }
}
