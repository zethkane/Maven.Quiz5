package rocks.zipcode.io.quiz4.fundamentals.palindromeevaluator;

import org.junit.Test;
import rocks.zipcode.io.quiz4.fundamentals.PalindromeEvaluator;
import rocks.zipcode.io.quiz4.objectorientation.PalindromeObject;
import rocks.zipcode.io.quiz4.utils.TestUtils;

/**
 * @author leon on 11/12/2018.
 */
public class PalindromeEvaluatorGetAllPalindromesTest {
    @Test
    public void test1() {
        // given
        String input = "aba";
        String[] expected = new String[]{"a", "b", "aba"};
        test(input, expected);
    }

    @Test
    public void test2() {
        // given
        String input = "rezzer";
        String[] expected = new String[]{"r", "e", "z", "ezze", "rezzer", "zz"};
        test(input, expected);
    }


    @Test
    public void test3() {
        // given
        String input = "rozor";
        String[] expected = new String[]{"o", "ozo", "r", "rozor", "z"};
        test(input, expected);
    }

    @Test
    public void test4() {
        // given
        String input = "cizic";
        String[] expected = new String[]{"c", "cizic", "i", "izi", "z"};
        test(input, expected);
    }

    public void test(String input, String... expected) {
        // when
        String[] actual = PalindromeEvaluator.getAllPalindromes(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }
}
