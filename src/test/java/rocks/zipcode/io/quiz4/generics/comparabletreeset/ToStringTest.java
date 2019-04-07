package rocks.zipcode.io.quiz4.generics.comparabletreeset;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.ComparableTreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ToStringTest {
    @Test
    public void test1() {
        // given
        String[] input = "efghiabcd".split("");
        ComparableTreeSet<String> set = new ComparableTreeSet<>(input);
        String expected = "[a, b, c, d, e, f, g, h, i]";

        // when
        String actual = set.toString();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String[] input = "cba".split("");
        ComparableTreeSet<String> set = new ComparableTreeSet<>(input);
        String expected = "[a, b, c]";

        // when
        String actual = set.toString();

        // then
        Assert.assertEquals(expected, actual);
    }
}
