package rocks.zipcode.io.quiz4.generics.comparabletreeset.compareto.nestedset.multipleelement;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.ComparableTreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class NestedSetCompareMultipleElementNegative {
    @Test
    public void test1() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("Artyx", "Feex", "Shawlx");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("Burtx", "Botx");
        ComparableTreeSet<ComparableTreeSet<String>> powerset1 = new ComparableTreeSet<>(set1, set2);

        ComparableTreeSet<String> set3 = new ComparableTreeSet<>("Candyx", "Canex");
        ComparableTreeSet<String> set4 = new ComparableTreeSet<>("Cornyx", "Carlx");
        ComparableTreeSet<ComparableTreeSet<String>> powerset2 = new ComparableTreeSet<>(set3, set4);

        // when
        Integer actual = powerset1.compareTo(powerset2);

        // then
        Assert.assertTrue(actual < 0);
    }


    @Test
    public void test2() {
        // given
        ComparableTreeSet<String> set1 = new ComparableTreeSet<>("Froilanx", "Mirandax");
        ComparableTreeSet<String> set2 = new ComparableTreeSet<>("Wilhemx", "Alcivarx");
        ComparableTreeSet<ComparableTreeSet<String>> powerset1 = new ComparableTreeSet<>(set1, set2);

        ComparableTreeSet<String> set3 = new ComparableTreeSet<>("Leonx", "Hunterx");
        ComparableTreeSet<String> set4 = new ComparableTreeSet<>("Nhux", "Nguyenx");
        ComparableTreeSet<ComparableTreeSet<String>> powerset2 = new ComparableTreeSet<>(set3, set4);

        // when
        Integer actual = powerset1.compareTo(powerset2);

        // then
        Assert.assertTrue(actual < 0);
    }
}
