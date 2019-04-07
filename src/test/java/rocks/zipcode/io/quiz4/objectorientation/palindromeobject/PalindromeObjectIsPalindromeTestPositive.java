package rocks.zipcode.io.quiz4.objectorientation.palindromeobject;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.objectorientation.PalindromeObject;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObjectIsPalindromeTestPositive {
    @Test
    public void test1() {
        test("racxcar");
    }

    @Test
    public void test2() {
        test("racXcar");
    }
    
    @Test
    public void test3() {
        test("rexxer");
    }
    
    @Test
    public void test4() {
        test("redrumXmurder");
    }
    
    public void test(String input) {
        Assert.assertTrue(new PalindromeObject(input).isPalindrome());
    }
}
