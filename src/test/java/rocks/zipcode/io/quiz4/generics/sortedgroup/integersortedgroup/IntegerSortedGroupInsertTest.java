package rocks.zipcode.io.quiz4.generics.sortedgroup.integersortedgroup;

import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.INTERNAL;
import rocks.zipcode.io.quiz4.generics.Group;
import rocks.zipcode.io.quiz4.generics.SortedGroup;

/**
 * @author leon on 11/12/2018.
 */
public class IntegerSortedGroupInsertTest {
    @Test
    public void test1() {
        // given
        SortedGroup<Integer> group = new SortedGroup<>();
        Integer firstValue = 11;
        Integer secondValue = 12;
        Integer thirdValue = 13;
        Integer fourthValue = 14;

        // when
        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        int firstValueIndex = group.indexOf(firstValue);
        int secondValueIndex = group.indexOf(secondValue);
        int thirdValueIndex = group.indexOf(thirdValue);
        int fourthValueIndex = group.indexOf(fourthValue);

        // then
        Assert.assertEquals(firstValueIndex, 0);
        Assert.assertEquals(secondValueIndex, 1);
        Assert.assertEquals(thirdValueIndex, 2);
        Assert.assertEquals(fourthValueIndex, 3);
    }

    @Test
    public void test2() {
        // given
        SortedGroup<Integer> group = new SortedGroup<>();
        Integer firstValue = 198;
        Integer secondValue = 1102;
        Integer thirdValue = 1362;
        Integer fourthValue = 1999;

        // when
        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        int firstValueIndex = group.indexOf(firstValue);
        int secondValueIndex = group.indexOf(secondValue);
        int thirdValueIndex = group.indexOf(thirdValue);
        int fourthValueIndex = group.indexOf(fourthValue);

        // then
        Assert.assertEquals(firstValueIndex, 0);
        Assert.assertEquals(secondValueIndex, 1);
        Assert.assertEquals(thirdValueIndex, 2);
        Assert.assertEquals(fourthValueIndex, 3);
    }


    @Test
    public void test3() {
        // given
        SortedGroup<Integer> group = new SortedGroup<>();
        Integer firstValue = Integer.MIN_VALUE;
        Integer secondValue = firstValue + 2;
        Integer thirdValue = secondValue + 3;
        Integer fourthValue = Integer.MAX_VALUE - 1;

        // when
        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        int firstValueIndex = group.indexOf(firstValue);
        int secondValueIndex = group.indexOf(secondValue);
        int thirdValueIndex = group.indexOf(thirdValue);
        int fourthValueIndex = group.indexOf(fourthValue);

        // then
        Assert.assertEquals(firstValueIndex, 0);
        Assert.assertEquals(secondValueIndex, 1);
        Assert.assertEquals(thirdValueIndex, 2);
        Assert.assertEquals(fourthValueIndex, 3);
    }
}
