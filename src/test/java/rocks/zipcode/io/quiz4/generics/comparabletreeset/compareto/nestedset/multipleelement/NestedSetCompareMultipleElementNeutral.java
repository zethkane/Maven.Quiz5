package rocks.zipcode.io.quiz4.generics.comparabletreeset.compareto.nestedset.multipleelement;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.ComparableTreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class NestedSetCompareMultipleElementNeutral {
    @Test
    public void test1() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("Wilhemx", "Alcivarx");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("Leonx", "Hunterx");
        ComparableTreeSet<ComparableTreeSet<String>> powerset1 = new ComparableTreeSet<>(set1, set2);

        ComparableTreeSet<String> set3 = new ComparableTreeSet<>("Leonx", "Hunterx");
        ComparableTreeSet<String> set4 = new ComparableTreeSet<>("Wilhemx", "Alcivarx");
        ComparableTreeSet<ComparableTreeSet<String>> powerset2 = new ComparableTreeSet<>(set3, set4);

        // when
        Integer actual = powerset1.compareTo(powerset2);

        // then
        Assert.assertTrue(actual == 0);
    }


    @Test
    public void test2() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("The", "Quickx", "Brownx", "Foxx", "Jumpsx");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("Overx", "Thex", "Lazyx", "Dogx");
        ComparableTreeSet<ComparableTreeSet<String>> powerset1 = new ComparableTreeSet<>(set1, set2);

        ComparableTreeSet<String> set3 = new ComparableTreeSet<>("Brownx", "Jumpsx", "Foxx", "Quickx", "Thex");
        ComparableTreeSet<String> set4 = new ComparableTreeSet<>("Thex", "Lazyx", "Dogx", "Overx");
        ComparableTreeSet<ComparableTreeSet<String>> powerset2 = new ComparableTreeSet<>(set3, set4);

        // when
        Integer actual = powerset1.compareTo(powerset2);

        // then
        Assert.assertTrue(actual == 0);
    }
}
