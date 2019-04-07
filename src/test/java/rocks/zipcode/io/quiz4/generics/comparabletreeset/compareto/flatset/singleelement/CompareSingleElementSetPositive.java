package rocks.zipcode.io.quiz4.generics.comparabletreeset.compareto.flatset.singleelement;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.ComparableTreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class CompareSingleElementSetPositive {
    @Test
    public void test1() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("bx");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("a");
        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertTrue(actual > 0);
    }

    @Test
    public void test2() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("cx");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("ax");
        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertTrue(actual > 0);
    }

    @Test
    public void test3() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("dx");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("ax");
        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertTrue(actual > 0);
    }
}
