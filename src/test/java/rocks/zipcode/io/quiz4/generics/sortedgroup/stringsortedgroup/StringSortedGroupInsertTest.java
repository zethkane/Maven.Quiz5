package rocks.zipcode.io.quiz4.generics.sortedgroup.stringsortedgroup;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.SortedGroup;

/**
 * @author leon on 11/12/2018.
 */
public class StringSortedGroupInsertTest {

    @Test
    public void test1() {
        // given
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = "A1";
        String secondValue = "B1";
        String thirdValue = "C1";
        String fourthValue = "D1";

        // when
        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        int indexOfFirstValue = group.indexOf(firstValue);
        int indexOfSecondValue = group.indexOf(secondValue);
        int indexOfThirdValue = group.indexOf(thirdValue);
        int indexOfFourthValue = group.indexOf(fourthValue);
        System.out.println(group);
        // then
        Assert.assertEquals(indexOfFirstValue, 0);
        Assert.assertEquals(indexOfSecondValue, 1);
        Assert.assertEquals(indexOfThirdValue, 2);
        Assert.assertEquals(indexOfFourthValue, 3);
    }
    @Test
    public void test2() {
        // given
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = "a1";
        String secondValue = "b1";
        String thirdValue = "c1";
        String fourthValue = "d1";

        // when
        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        int indexOfFirstValue = group.indexOf(firstValue);
        int indexOfSecondValue = group.indexOf(secondValue);
        int indexOfThirdValue = group.indexOf(thirdValue);
        int indexOfFourthValue = group.indexOf(fourthValue);
        System.out.println(group);
        // then
        Assert.assertEquals(indexOfFirstValue, 0);
        Assert.assertEquals(indexOfSecondValue, 1);
        Assert.assertEquals(indexOfThirdValue, 2);
        Assert.assertEquals(indexOfFourthValue, 3);
    }

    @Test
    public void test3() {
        // given
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = "A1";
        String secondValue = "B1";
        String thirdValue = "a1";
        String fourthValue = "b1";

        // when
        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        int indexOfFirstValue = group.indexOf(firstValue);
        int indexOfSecondValue = group.indexOf(secondValue);
        int indexOfThirdValue = group.indexOf(thirdValue);
        int indexOfFourthValue = group.indexOf(fourthValue);
        System.out.println(group);
        // then
        Assert.assertEquals(indexOfFirstValue, 0);
        Assert.assertEquals(indexOfSecondValue, 1);
        Assert.assertEquals(indexOfThirdValue, 2);
        Assert.assertEquals(indexOfFourthValue, 3);
    }


    @Test
    public void test4() {
        // given
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = "Astro1";
        String secondValue = "Bicycle1";
        String thirdValue = "Carnations1";
        String fourthValue = "Dinosaur1";

        // when
        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        int indexOfFirstValue = group.indexOf(firstValue);
        int indexOfSecondValue = group.indexOf(secondValue);
        int indexOfThirdValue = group.indexOf(thirdValue);
        int indexOfFourthValue = group.indexOf(fourthValue);
        System.out.println(group);
        // then
        Assert.assertEquals(indexOfFirstValue, 0);
        Assert.assertEquals(indexOfSecondValue, 1);
        Assert.assertEquals(indexOfThirdValue, 2);
        Assert.assertEquals(indexOfFourthValue, 3);
    }

    @Test
    public void test6() {
        // given
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = "Astro1";
        String secondValue = "Carnations1";
        String thirdValue = "bicycle1";
        String fourthValue = "dinosaur1";

        // when
        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        int indexOfFirstValue = group.indexOf(firstValue);
        int indexOfSecondValue = group.indexOf(secondValue);
        int indexOfThirdValue = group.indexOf(thirdValue);
        int indexOfFourthValue = group.indexOf(fourthValue);
        System.out.println(group);
        // then
        Assert.assertEquals(indexOfFirstValue, 0);
        Assert.assertEquals(indexOfSecondValue, 1);
        Assert.assertEquals(indexOfThirdValue, 2);
        Assert.assertEquals(indexOfFourthValue, 3);
    }


    @Test
    public void test7() {
        // given
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = "11";
        String secondValue = "12";
        String thirdValue = "13";
        String fourthValue = "14";

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
    public void test8() {
        // given
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = "1102";
        String secondValue = "1362";
        String thirdValue = "198";
        String fourthValue = "1999";

        // when
        group.insert(fourthValue);
        group.insert(firstValue);
        group.insert(thirdValue);
        group.insert(secondValue);

        int indexOfFirstValue = group.indexOf(firstValue);
        int indexOfSecondValue = group.indexOf(secondValue);
        int indexOfThirdValue = group.indexOf(thirdValue);
        int indexOfFourthValue = group.indexOf(fourthValue);
        System.out.println(group);
        // then
        Assert.assertEquals(indexOfFirstValue, 0);
        Assert.assertEquals(indexOfSecondValue, 1);
        Assert.assertEquals(indexOfThirdValue, 2);
        Assert.assertEquals(indexOfFourthValue, 3);
    }


    @Test
    public void test9() {
        // given
        SortedGroup<String> group = new SortedGroup<>();
        String firstValue = String.valueOf(Integer.MIN_VALUE + 3);
        String secondValue = String.valueOf(Integer.MIN_VALUE + 4);
        String thirdValue = String.valueOf(Integer.MIN_VALUE);
        String fourthValue = String.valueOf(Integer.MAX_VALUE);

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
