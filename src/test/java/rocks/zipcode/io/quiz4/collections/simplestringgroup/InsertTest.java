package rocks.zipcode.io.quiz4.collections.simplestringgroup;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.collections.SimpleStringGroup;

/**
 * @author leon on 11/12/2018.
 */
public class InsertTest {
    @Test
    public void test1() {
        test("blah ");
    }

    @Test
    public void test2() {
        test("blah blah ");
    }

    @Test
    public void test3() {
        test("blah blah blah ");
    }

    private void test(String valueToInsert) {
        // given
        SimpleStringGroup group = new SimpleStringGroup();

        // when
        Assert.assertFalse(group.has(valueToInsert));
        group.insert(valueToInsert);

        // then
        Assert.assertTrue(group.has(valueToInsert));
    }
}
