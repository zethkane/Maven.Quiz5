package rocks.zipcode.io.quiz4.generics.stack.integerstack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcode.io.quiz4.generics.MyStack;

/**
 * @author leon on 11/12/2018.
 */
public class IntegerStackPushTest {
    private MyStack<Integer> stack;

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
        Integer expected = 10;
        stack.push(expected);
        Assert.assertEquals(stack.peek(), expected);
    }

    @Test
    public void test3() {
        Integer expected = 11;
        stack.push(expected);
        Assert.assertEquals(stack.peek(), expected);
    }

    @Test
    public void test4() {
        Integer val1 = 110;
        Integer val2 = 115;
        Integer val3 = 120;
        Integer expected = 125;

        stack.push(val1);
        stack.push(val2);
        stack.push(val3);
        stack.push(expected);

        Assert.assertEquals(stack.peek(), expected);
    }

    @Test
    public void test5() {
        Integer  val1 = 130;
        Integer  val2 = 130;
        Integer  val3 = 140;
        Integer  expected = 145;

        stack.push(val1);
        stack.push(val2);
        stack.push(val3);
        stack.push(expected);

        Assert.assertEquals(stack.peek(), expected);
    }
}
