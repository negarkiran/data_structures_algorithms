package datastructures.linkedlist.single;

import datastructures.linkedlist.single.Node;
import datastructures.linkedlist.single.ReverseLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseLinkedListTest {

    private ReverseLinkedList reverseLinkedList;

    @Test
    public void shouldReverseLinkedList() {
        reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.getLinkedList().add(new Node(1));
        reverseLinkedList.getLinkedList().add(new Node(2));
        reverseLinkedList.getLinkedList().add(new Node(3));
        reverseLinkedList.getLinkedList().add(new Node(4));

        Node reverse = reverseLinkedList.reverse();
        assertEquals(4, reverse.getData());
    }

}