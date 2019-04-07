package rocks.zipcode.io.quiz4.generics.group;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.Group;

/**
 * @author leon on 11/12/2018.
 */
public class GroupToStringTest {
    @Test
    public void test1() {
        String expected = "[the1, quick1, brown1, fox1]";
        Group<String> group = new Group<>();
        group.insert("the1");
        group.insert("quick1");
        group.insert("brown1");
        group.insert("fox1");

        // when
        String actual = group.toString();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String expected = "[1123, 1456, 1789, 1101112]";
        Group<Number> group = new Group<>();
        group.insert(1123);
        group.insert(1456);
        group.insert(1789);
        group.insert(1101112);

        // when
        String actual = group.toString();

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test3() {
        String expected = "[e, f, g, h]";
        Group<Character> group = new Group<>();
        group.insert('e');
        group.insert('f');
        group.insert('g');
        group.insert('h');

        // when
        String actual = group.toString();

        // then
        Assert.assertEquals(expected, actual);
    }
}
