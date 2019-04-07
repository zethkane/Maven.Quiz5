package rocks.zipcode.io.quiz4.generics.group.integergroup;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.Group;

/**
 * @author leon on 11/12/2018.
 */
public class IntegerGroupClearTest {
    @Test
    public void test1() {
        test(7, 8, 9, 10);
    }

    @Test
    public void test2() {
        test(7, 8, 9, 1, 11);
    }

    @Test
    public void test3() {
        test(4, 5, 6, 1, 11, 111);
    }

    private void test(Integer... valuesToInsert) {
        // given
        Group<Integer> group = new Group<>();
        for (Integer valueToInsert : valuesToInsert) {
            group.insert(valueToInsert);
            Assert.assertTrue(group.has(valueToInsert));
        }

        // when
        group.clear();


        // then
        for (Integer valueToInsert : valuesToInsert) {
            Assert.assertFalse(group.has(valueToInsert));
        }
    }
}
