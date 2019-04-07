package rocks.zipcode.io.quiz4.generics.comparabletreeset.compareto.flatset.multipleelement;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.ComparableTreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class CompareMultipleElementPositive {

    @Test
    public void test1() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("Burtxxxx", "Bellyxx", "Botxx");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("Artyxxx", "Feexxx", "Shawlxxx");

        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertTrue(actual > 0);
    }


    @Test
    public void test2() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("Cornyxx", "Carlxxx", "Cartxxx");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("Candyxxx", "Canexxxx", "Corksxx");

        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertTrue(actual > 0);
    }


    @Test
    public void test3() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("Cornyxxx", "Carlxxx", "Cartxxx");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("", "axx", "zxx");

        // when
        Integer actual = set1.compareTo(set2);

        // then
        Assert.assertTrue(actual > 0);
    }
}
