package datastructures.trees.traversal;

import datastructures.trees.Node;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LevelTraversalTest {

    @Test
    public void shouldDoLevelTraversal() {
        LevelTraversal levelTraversal = new LevelTraversal();
        Node<Integer> root = new Node<>(1);

        Node<Integer> firstChild = new Node<Integer>(2);

        root.setPrev(firstChild);

        Node<Integer> secondChild = new Node<>(3);
        secondChild.setPrev(new Node<>(6));
        secondChild.setNext(new Node<>(7));

        root.setNext(secondChild);
        List<Integer> result = levelTraversal.traverse(root);
        assertNull(result.get(3));
        assertEquals(6, result.get(5), 0);
    }

}