package datastructures.linkedlist.single;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CycleTest {

    @Test
    public void shouldIdentifyCycle() {
        Cycle cycle = new Cycle();
        Node<Integer> root = new Node<>(0);
        Node<Integer> first = new Node<>(1);
        Node<Integer> second = new Node<>(2);
        Node<Integer> third = new Node<>(3);
        root.setNext(first);
        first.setNext(second);
        second.setNext(third);
        third.setNext(root);
        assertTrue(cycle.hasCycle(root));
    }

    @Test
    public void shouldNotIdentifyCycle() {
        Cycle cycle = new Cycle();
        Node<Integer> root = new Node<>(0);
        Node<Integer> first = new Node<>(1);
        Node<Integer> second = new Node<>(2);
        Node<Integer> third = new Node<>(3);
        root.setNext(first);
        first.setNext(second);
        second.setNext(third);
        assertFalse(cycle.hasCycle(root));
    }

}