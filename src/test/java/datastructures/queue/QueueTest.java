package datastructures.queue;

import datastructures.queue.Queue;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QueueTest {

    private Queue queue;

    @Before
    public void setup() {
        queue = new Queue(5);
    }

    @Test
    public void shouldAddItem() {
        assertTrue(queue.add(1));
        assertTrue(queue.add(2));
        assertEquals(2, Arrays.stream(queue.get()).filter(Objects::nonNull).count());
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenQueueIsFull() {
        assertTrue(queue.add(1));
        assertTrue(queue.add(2));
        assertTrue(queue.add(3));
        assertTrue(queue.add(4));
        assertTrue(queue.add(5));
        assertTrue(queue.add(6));
    }

    @Test
    public void shouldRemoveItemFromRearEnd() {
        assertTrue(queue.add(1));
        assertTrue(queue.add(2));
        assertTrue(queue.add(3));

        assertEquals(1, queue.remove());
        assertEquals(2, queue.remove());
        assertEquals(3, queue.remove());
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenQueueIsEmptyAndTriedToRemoveItem() {
        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
    }

    @Test
    public void shouldAllowToAddItemsWhenQueueIsEmpty() {
        queue.add(1);
        queue.add(2);
        queue.remove();
        queue.add(3);
        queue.remove();
        queue.add(4);

        assertEquals(2, Arrays.stream(queue.get()).filter(Objects::nonNull).count());
        assertEquals(3, queue.remove());
        assertEquals(4, queue.remove());
    }

}