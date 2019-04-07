package rocks.zipcode.io.quiz4.objectorientation.palindromeobject;

import org.junit.Test;
import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;
import rocks.zipcode.io.quiz4.objectorientation.PalindromeObject;
import rocks.zipcode.io.quiz4.utils.TestUtils;

/**
 * @author leon on 11/12/2018.
 */
public class PalindromeObjectGetAllPalindromesTest {
    @Test
    public void test1() {
        // given
        String input = "racxcar";
        String[] expected = new String[]{"a", "acxca", "c", "cxc", "e", "r", "racxcar"};
        test(input, expected);
    }

    @Test
    public void test2() {
        // given
        String input = "redder";
        String[] expected = new String[]{"x", "xx", "e", "exxe", "r", "rexxer"};
        test(input, expected);
    }


    @Test
    public void test3() {
        // given
        String input = "roxor";
        String[] expected = new String[]{"o", "oxo", "r", "roxor", "x"};
        test(input, expected);
    }

    @Test
    public void test4() {
        // given
        String input = "cixic";
        String[] expected = new String[]{"c", "cixic", "i", "ixi", "x"};
        test(input, expected);
    }

    public void test(String input, String... expected) {
        // when
        String[] actual = new PalindromeObject(input).getAllPalindromes();

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }
}
