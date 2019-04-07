package rocks.zipcode.io.quiz4.generics.comparabletreeset.compareto.flatset.singleelement;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.ComparableTreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class CompareSingleElementNeutral {
    @Test
    public void test1() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("ax");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("ax");
        Integer expected = 0;
        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("bx");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("bx");
        Integer expected = 0;
        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("cx");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("cx");
        Integer expected = 0;
        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertEquals(expected, actual);
    }
}
