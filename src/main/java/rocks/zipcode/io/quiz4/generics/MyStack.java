package rocks.zipcode.io.quiz4.generics;

import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> {
    private Stack<SomeType> stack;
    public MyStack() {
        this.stack = new Stack<>();
    }

    public Boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(SomeType i) {
        stack.push(i);
    }

    public SomeType peek() {
       return stack.peek();
    }

    public SomeType pop() {
        return stack.pop();
    }
}
