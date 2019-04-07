package rocks.zipcode.io.quiz4.objectorientation.stringevaluatorobject;

import org.junit.Test;
import rocks.zipcode.io.quiz4.objectorientation.StringEvaluatorObject;
import rocks.zipcode.io.quiz4.utils.TestUtils;

/**
 * @author leon on 11/12/2018.
 */
public class GetAllSubstrings {
    @Test
    public void test1() {
        // given
        String input = "X";
        String[] expected = {input};
        test(input, expected);
    }

    @Test
    public void test2() {
        // given
        String input = "Z";
        String[] expected = {input};
        test(input, expected);
    }


    @Test
    public void test3() {
        // given
        String input = "XB";
        String[] expected = {"X", "B", "XB"};
        test(input, expected);
    }


    @Test
    public void test4() {
        // given
        String input = "XBB";
        String[] expected = {"X", "XB", "XBB", "B", "BB"};
        test(input, expected);
    }


    @Test
    public void test5() {
        // given
        String input = "XXBB";
        String[] expected = {"X", "XX", "XXB", "XXBB", "XB", "XBB", "B", "BB"};
        test(input, expected);
    }



    @Test
    public void test6() {
        // given
        String input = "XXaa";
        String[] expected = {"X", "XX", "XXa", "XXaa", "Xa", "Xaa", "a", "aa"};
        test(input, expected);
    }


    private void test(String input, String[] expected) {
        // when
        String[] actual = new StringEvaluatorObject(input).getAllSubstrings();

        // then
        TestUtils.assertArrayEquals(expected, actual);

    }
}
