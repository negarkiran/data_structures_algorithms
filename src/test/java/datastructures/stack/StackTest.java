package datastructures.stack;

import datastructures.stack.Stack;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.Assert.assertEquals;

public class StackTest {

    private Stack stack;

    @Before
    public void setup() {
        stack = new Stack(5);
    }

    @Test
    public void shouldPushItem() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertEquals(4, Arrays.stream(stack.get()).filter(Objects::nonNull).count());
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenStackIsFull() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
    }

    @Test
    public void shouldPopItem() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertEquals(4, stack.pop(), 0);
        assertEquals(3, stack.pop(), 0);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenStackGoesEmptyWhilePopping() {
        stack.push(1);
        stack.pop();
        stack.pop();
    }
}