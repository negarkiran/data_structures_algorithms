package datastructures.stack;

import java.util.Arrays;
import java.util.Objects;

public class Stack {

    private Integer[] stack;
    private Integer top = -1;
    private Integer size;

    public Stack(Integer size) {
        this.size = size;
        this.stack = new Integer[size];
    }

    public Integer push(Integer number) {
        long stackContent = Arrays.stream(stack).filter(Objects::nonNull).count();
        if (stackContent < size) {
            stack[++top] = number;
            return number;
        }
        throw new RuntimeException("Stack is full");
    }

    public Integer pop() {
        if (top < 0) {
            throw new RuntimeException("Stack is empty");
        }
        Integer topItem = stack[top];
        stack[top--] = null;
        return topItem;
    }

    public Integer[] get() {
        return stack;
    }
}
