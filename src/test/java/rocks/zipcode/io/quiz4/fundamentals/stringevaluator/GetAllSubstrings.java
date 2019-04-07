package rocks.zipcode.io.quiz4.fundamentals.stringevaluator;

import org.junit.Test;
import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;
import rocks.zipcode.io.quiz4.utils.TestUtils;

/**
 * @author leon on 11/12/2018.
 */
public class GetAllSubstrings {
    @Test
    public void test1() {
        // given
        String input = "Z";
        String[] expected = {input};

        // when
        String[] actual = StringEvaluator.getAllSubstrings(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String input = "X";
        String[] expected = {input};

        // when
        String[] actual = StringEvaluator.getAllSubstrings(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }


    @Test
    public void test3() {
        // given
        String input = "ZB";
        String[] expected = {"Z", "B", "ZB"};

        // when
        String[] actual = StringEvaluator.getAllSubstrings(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }


    @Test
    public void test4() {
        // given
        String input = "ZBB";
        String[] expected = {"Z", "ZB", "ZBB", "B", "BB"};

        // when
        String[] actual = StringEvaluator.getAllSubstrings(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }


    @Test
    public void test5() {
        // given
        String input = "ZZBB";
        String[] expected = {"Z", "ZZ", "ZZB", "ZZBB", "ZB", "ZBB", "B", "BB"};

        // when
        String[] actual = StringEvaluator.getAllSubstrings(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }



    @Test
    public void test7() {
        // given
        String input = "H";
        String[] expected = {input};

        // when
        String[] actual = StringEvaluator.getAllSubstrings(input);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }
}
