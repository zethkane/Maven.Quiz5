package rocks.zipcode.io.quiz4.generics.stack.stringstack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.MyStack;

/**
 * @author leon on 11/12/2018.
 */
public class StringStackPushTest {
    private MyStack<String> stack;

    @Before
    public void setup() {
        this.stack = new MyStack<>();
    }

    @Test
    public void test1() {
        Assert.assertNull(stack.peek());
    }

    @Test
    public void test2() {
        String expected = "10";
        stack.push(expected);
        Assert.assertEquals(stack.peek(), expected);
    }

    @Test
    public void test3() {
        String expected = "11";
        stack.push(expected);
        Assert.assertEquals(stack.peek(), expected);
    }

    @Test
    public void test4() {
        String val1 = "110";
        String val2 = "115";
        String val3 = "120";
        String expected = "125";

        stack.push(val1);
        stack.push(val2);
        stack.push(val3);
        stack.push(expected);

        Assert.assertEquals(stack.peek(), expected);
    }

    @Test
    public void test5() {
        String  val1 = "130";
        String  val2 = "135";
        String  val3 = "140";
        String  expected = "145";

        stack.push(val1);
        stack.push(val2);
        stack.push(val3);
        stack.push(expected);

        Assert.assertEquals(stack.peek(), expected);
    }
}
