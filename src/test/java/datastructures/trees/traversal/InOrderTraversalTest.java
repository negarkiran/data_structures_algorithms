package datastructures.trees.traversal;

import datastructures.trees.Node;
import org.junit.Test;

public class InOrderTraversalTest {

    @Test
    public void shouldTraverseInInorder(){

        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        Node<Integer> root = new Node<Integer>(1);

        Node<Integer> firstChild = new Node<Integer>(2);
        firstChild.setPrev(new Node<Integer>(4));
        firstChild.setNext(new Node<Integer>(5));

        root.setPrev(firstChild);

        Node<Integer> secondChild = new Node<Integer>(3);
        secondChild.setPrev(new Node<Integer>(6));
        secondChild.setNext(new Node<Integer>(7));

        root.setNext(secondChild);

        inOrderTraversal.inOrder(root);
    }
}