package datastructures.linkedlist.doubly;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DoublyLinkedListTest {

    private DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

    @Test
    public void shouldAddElementsToEndOfList() {
        doublyLinkedList.addLast(new Node<>(1));
        doublyLinkedList.addLast(new Node<>(2));
        doublyLinkedList.addLast(new Node<>(3));

        assertEquals(1, doublyLinkedList.getHead().getData());
        assertEquals(3, doublyLinkedList.getTail().getData());
        assertEquals(3, doublyLinkedList.getSize());
    }

    @Test
    public void shouldAddElementsToBeginningOfList() {
        doublyLinkedList.addLast(new Node<>(1));
        doublyLinkedList.addLast(new Node<>(2));
        doublyLinkedList.addFirst(new Node<>(3));

        assertEquals(3, doublyLinkedList.getHead().getData());
        assertEquals(2, doublyLinkedList.getTail().getData());
        assertEquals(3, doublyLinkedList.getSize());
    }

    @Test
    public void shouldRemoveLastElementFromList() {
        doublyLinkedList.addLast(new Node<>(1));
        doublyLinkedList.addLast(new Node<>(2));
        doublyLinkedList.addLast(new Node<>(3));
        doublyLinkedList.addLast(new Node<>(4));
        doublyLinkedList.addLast(new Node<>(5));
        doublyLinkedList.addLast(new Node<>(6));

        assertEquals(6, doublyLinkedList.removeLast().getData());
        assertEquals(5, doublyLinkedList.removeLast().getData());

        assertEquals(1, doublyLinkedList.getHead().getData());
        assertEquals(4, doublyLinkedList.getTail().getData());
        assertEquals(4, doublyLinkedList.getSize());
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenTryToRemoveFromEmptyList() {
        doublyLinkedList.removeLast();
    }

    @Test
    public void shouldAddElementAtIndex() {
        doublyLinkedList.addLast(new Node<>(1));
        doublyLinkedList.addLast(new Node<>(2));
        doublyLinkedList.addLast(new Node<>(3));
        doublyLinkedList.addLast(new Node<>(5));

        assertEquals(4, doublyLinkedList.insertAt(new Node<>(4), 3).getData());
        assertEquals(5, doublyLinkedList.getSize());
    }

    @Test
    public void shouldAddElementAtLastUsingIndex() {
        doublyLinkedList.addLast(new Node<>(1));
        doublyLinkedList.addLast(new Node<>(2));
        doublyLinkedList.addLast(new Node<>(3));
        doublyLinkedList.addLast(new Node<>(4));

        assertEquals(5, doublyLinkedList.insertAt(new Node<>(5), 4).getData());
        assertEquals(5, doublyLinkedList.getTail().getData());
        assertEquals(5, doublyLinkedList.getSize());
    }

    @Test
    public void shouldRemoveFirstElementFromList() {
        doublyLinkedList.addLast(new Node<>(1));
        doublyLinkedList.addLast(new Node<>(2));
        doublyLinkedList.addLast(new Node<>(3));
        doublyLinkedList.addLast(new Node<>(4));

        assertEquals(1, doublyLinkedList.removeFirst().getData());
        assertEquals(2, doublyLinkedList.removeFirst().getData());

        assertEquals(3, doublyLinkedList.getHead().getData());
        assertEquals(4, doublyLinkedList.getTail().getData());
        assertEquals(2, doublyLinkedList.getSize());
    }

    @Test
    public void shouldRemoveFirstElementFromListWhenThereIsOnlyOneItem() {
        doublyLinkedList.addLast(new Node<>(1));

        assertEquals(1, doublyLinkedList.removeFirst().getData());

        assertNull(doublyLinkedList.getHead());
        assertNull(doublyLinkedList.getTail());
        assertEquals(0, doublyLinkedList.getSize());
    }

}