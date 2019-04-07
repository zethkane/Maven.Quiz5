package rocks.zipcode.io.quiz4.fundamentals.palindromeevaluator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;
import rocks.zipcode.io.quiz4.objectorientation.PalindromeObject;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluatorIsPalindromeTestNegative {
    @Test
    public void test1() {
        test("Raczcar");
    }

    @Test
    public void test2() {
        test("Rezzer");
    }

    @Test
    public void test3() {
        test("Redrum murderz");
    }

    public void test(String input) {
        Assert.assertFalse(PalindromeEvaluator.isPalindrome(input));
    }
}
