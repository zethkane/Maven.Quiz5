package rocks.zipcode.io.quiz4.objectorientation.stringevaluatorobject;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.objectorientation.StringEvaluatorObject;

/**
 * @author leon on 11/12/2018.
 */
public class GetLargestCommonSubstringTest {
    @Test
    public void test1() {
        // given
        String firstInput = "XXB";
        String secondInput = "XXXB";
        String expected = "XXB";
        test(firstInput, secondInput, expected);
    }

    @Test
    public void test2() {
        // given
        String firstInput = "AAXB";
        String secondInput = "AAAB";
        String expected = "AA";
        test(firstInput, secondInput, expected);
    }



    @Test
    public void test3() {
        // given
        String firstInput = "Xapple";
        String secondInput = "Candy apples!";
        String expected = "apple";
        test(firstInput, secondInput, expected);
    }



    @Test
    public void test4() {
        // given
        String firstInput = "Xrreducible complexity";
        String secondInput = "Deductive operations";
        String expected = "educ";
        test(firstInput, secondInput, expected);
    }


    private void test(String firstInput, String secondInput, String expected) {
        // when
        String actual = new StringEvaluatorObject(firstInput).getLargestCommonSubstring(secondInput);

        // then
        Assert.assertEquals(expected, actual);
    }
}
