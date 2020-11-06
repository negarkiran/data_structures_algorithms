package datastructures.linkedlist.single;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTwoNumbersTest {

    @Test
    public void shouldAddTwoNumbersRepresentedAsReversedLists(){
        Node<Integer> node1 = new Node<>(5);
        node1.setNext(new Node<>(6));
        node1.getNext().setNext(new Node<>(3));

        Node<Integer> node2 = new Node<>(8);
        node2.setNext(new Node<>(4));
        node2.getNext().setNext(new Node<>(2));

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        Node<Integer> result = addTwoNumbers.add(node1, node2);
        assertEquals(3, result.getData(), 0);
        assertEquals(1, result.getNext().getData(), 0);
        assertEquals(6, result.getNext().getNext().getData(), 0);
    }

}