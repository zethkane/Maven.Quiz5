package rocks.zipcode.io.quiz4.fundamentals.stringevaluator;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 11/12/2018.
 */
public class GetLargestCommonSubstringTest {
    @Test
    public void test1() {
        // given
        String firstInput = "ZZB";
        String secondInput = "ZZZB";
        String expected = "ZZB";

        // when
        String actual = StringEvaluator.getLargestCommonSubstring(firstInput, secondInput);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String firstInput = "AAXB";
        String secondInput = "AAAB";
        String expected = "AA";

        // when
        String actual = StringEvaluator.getLargestCommonSubstring(firstInput, secondInput);

        // then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void test3() {
        // given
        String firstInput = "Xapple";
        String secondInput = "Candy apples!";
        String expected = "apple";

        // when
        String actual = StringEvaluator.getLargestCommonSubstring(firstInput, secondInput);

        // then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void test4() {
        // given
        String firstInput = "Xrreducible complexity";
        String secondInput = "Deductive operations";
        String expected = "educ";

        // when
        String actual = StringEvaluator.getLargestCommonSubstring(firstInput, secondInput);

        // then
        Assert.assertEquals(expected, actual);
    }
}
