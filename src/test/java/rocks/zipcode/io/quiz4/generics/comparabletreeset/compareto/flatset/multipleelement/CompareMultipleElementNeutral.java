package rocks.zipcode.io.quiz4.generics.comparabletreeset.compareto.flatset.multipleelement;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.ComparableTreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class CompareMultipleElementNeutral {

    @Test
    public void test1() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("Artyxxxxx", "Feexxxx", "Shawlxxxx");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("Feexxxx", "Shawlxxxx", "Artyxxxxx");

        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertTrue(actual == 0);
    }


    @Test
    public void test2() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("Thexxx", "Quickxxx", "Brownxxxx", "Foxxxx", "Jumpsxxx");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("Jumpsxxx", "Brownxxxx", "Foxxxx", "Quickxxx", "Thexxx");

        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertTrue(actual == 0);
    }
}
