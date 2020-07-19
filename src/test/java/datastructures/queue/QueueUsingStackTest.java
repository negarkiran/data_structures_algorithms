package datastructures.queue;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueUsingStackTest {

    private QueueUsingStack queueUsingStack;

    @Before
    public void setup() {
        queueUsingStack = new QueueUsingStack();
    }

    @Test
    public void shouldEnqueueAndDequeItems() {
        queueUsingStack.enqueue(1);
        queueUsingStack.enqueue(2);
        queueUsingStack.enqueue(3);
        queueUsingStack.enqueue(4);

        queueUsingStack.dequeue();

        assertEquals(2, queueUsingStack.dequeue(), 0);
    }

}