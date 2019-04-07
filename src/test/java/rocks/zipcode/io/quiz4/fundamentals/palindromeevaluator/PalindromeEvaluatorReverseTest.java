package rocks.zipcode.io.quiz4.fundamentals.palindromeevaluator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;
import rocks.zipcode.io.quiz4.objectorientation.PalindromeObject;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluatorReverseTest {
    @Test
    public void test1() {
        test("zeon", "noez");
    }

    @Test
    public void test2() {
        test("zerry", "yrrez");
    }

    @Test
    public void test3() {
        test("zJack", "kcaJz");
    }

    @Test
    public void test4() {
        test("zedrum murder", "redrum murdez");
    }

    public void test(String input, String expected) {
        String actual = PalindromeEvaluator.reverseString(input);
        Assert.assertEquals(expected, actual);
    }
}
