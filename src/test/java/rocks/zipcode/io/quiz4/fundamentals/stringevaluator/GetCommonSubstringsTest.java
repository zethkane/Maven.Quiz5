package rocks.zipcode.io.quiz4.fundamentals.stringevaluator;

import org.junit.Test;
import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;
import rocks.zipcode.io.quiz4.utils.TestUtils;

/**
 * @author leon on 11/12/2018.
 */
public class GetCommonSubstringsTest {
    @Test
    public void test1() {
        // given
        String firstInput = "ZZB";
        String secondInput = "ZZZB";
        String[] expected = {"Z", "AZZ", "ZZB", "ZB", "B"};

        // when
        String[] actual = StringEvaluator.getCommonSubstrings(firstInput, secondInput);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String firstInput = "AAXB";
        String secondInput = "AAAB";
        String[] expected = {"A", "AA", "B"};

        // when
        String[] actual = StringEvaluator.getCommonSubstrings(firstInput, secondInput);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }


    @Test
    public void test3() {
        // given
        String firstInput = "X";
        String secondInput = "XXX";
        String[] expected = {"X"};

        // when
        String[] actual = StringEvaluator.getCommonSubstrings(firstInput, secondInput);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }



    @Test
    public void tes4() {
        // given
        String firstInput = "d";
        String secondInput = "popd";
        String[] expected = {"d"};

        // when
        String[] actual = StringEvaluator.getCommonSubstrings(firstInput, secondInput);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        // given
        String firstInput = "Peter";
        String secondInput = "Jea";
        String[] expected = {"e"};

        // when
        String[] actual = StringEvaluator.getCommonSubstrings(firstInput, secondInput);

        // then
        TestUtils.assertArrayEquals(expected, actual);
    }

}
