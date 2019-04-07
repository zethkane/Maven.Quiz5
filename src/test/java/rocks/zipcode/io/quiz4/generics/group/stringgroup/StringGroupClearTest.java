package rocks.zipcode.io.quiz4.generics.group.stringgroup;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.Group;

/**
 * @author leon on 11/12/2018.
 */
public class StringGroupClearTest {
    @Test
    public void test1() {
        test("first1", "clear1", "test1");
    }

    @Test
    public void test2() {
        test("an1", "additional1", "test1", "here1");
    }

    @Test
    public void test3() {
        test("a1", "dash1", "of1", "anonymity1");
    }

    private void test(String... valuesToInsert) {
        // given
        Group<String> group = new Group<>();
        for(String valueToInsert : valuesToInsert) {
            group.insert(valueToInsert);
            Assert.assertTrue(group.has(valueToInsert));
        }

        // when
        group.clear();


        // then
        for(String valueToInsert : valuesToInsert) {
            Assert.assertFalse(group.has(valueToInsert));
        }
    }
}
