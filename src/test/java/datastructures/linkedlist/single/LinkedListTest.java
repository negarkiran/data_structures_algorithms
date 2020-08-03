package datastructures.linkedlist.single;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LinkedListTest {

    private LinkedList linkedList = new LinkedList();

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenTryToRemoveFromEmptyList() {
        linkedList.remove();
    }

    @Test
    public void shouldAddElements() {
        linkedList.add(new Node<>(1));
        linkedList.add(new Node<>(2));
        linkedList.add(new Node<>(3));

        assertEquals(1, linkedList.getHead().getData());
        assertEquals(3, linkedList.getTail().getData());
        assertEquals(3, linkedList.getSize());
    }

    @Test
    public void shouldRemoveOnlyElementInList() {
        linkedList.add(new Node<>(1));

        assertEquals(1, linkedList.getHead().getData());
        assertEquals(1, linkedList.getTail().getData());

        assertEquals(1, linkedList.remove().getData());

        assertNull(linkedList.getHead());
        assertNull(linkedList.getTail());
        assertEquals(0, linkedList.getSize());
    }

    @Test
    public void shouldRemoveLastElement() {
        linkedList.add(new Node<>(1));
        linkedList.add(new Node<>(2));
        linkedList.add(new Node<>(3));
        linkedList.add(new Node<>(4));

        assertEquals(1, linkedList.getHead().getData());
        assertEquals(4, linkedList.getTail().getData());

        assertEquals(4, linkedList.remove().getData());
        assertEquals(3, linkedList.remove().getData());
        linkedList.add(new Node<>(5));

        assertEquals(1, linkedList.getHead().getData());
        assertEquals(5, linkedList.getTail().getData());
        assertEquals(3, linkedList.getSize());
    }

    @Test
    public void shouldRemoveAnElementAtGivenIndex() {
        linkedList.add(new Node<>(1));
        linkedList.add(new Node<>(2));
        linkedList.add(new Node<>(3));
        linkedList.add(new Node<>(4));

        assertEquals(3, linkedList.removeAt(2).getData());
        assertEquals(4, linkedList.removeAt(2).getData());
        assertEquals(2, linkedList.getSize());

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenGivenIndexIsOutOfRange() {
        linkedList.add(new Node<>(1));
        linkedList.add(new Node<>(2));
        linkedList.add(new Node<>(3));
        linkedList.add(new Node<>(4));

        linkedList.removeAt(5);
    }

    @Test
    public void shouldClearAllTheElements() {
        linkedList.add(new Node<>(1));
        linkedList.add(new Node<>(2));
        linkedList.add(new Node<>(3));
        linkedList.add(new Node<>(4));

        linkedList.clear();
        assertNull(linkedList.getHead());
        assertNull(linkedList.getTail());
        assertEquals(0, linkedList.getSize());
    }

    @Test
    public void shouldAddElementsAtIndex() {
        linkedList.add(new Node<>(1));
        linkedList.add(new Node<>(2));
        linkedList.add(new Node<>(3));
        linkedList.add(new Node<>(5));

        linkedList.insertAt(new Node<>(4), 3);

        assertEquals(4, linkedList.get(3).getData());
        assertEquals(5, linkedList.getSize());
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenWrongIndexIsProvidedToAdd() {
        linkedList.add(new Node<>(1));
        linkedList.add(new Node<>(2));
        linkedList.add(new Node<>(3));
        linkedList.add(new Node<>(5));

        linkedList.insertAt(new Node<>(4), 6);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenWrongIndexIsProvidedWhenSingleItemIsThere() {
        linkedList.add(new Node<>(1));

        linkedList.insertAt(new Node<>(4), 2);
    }
}