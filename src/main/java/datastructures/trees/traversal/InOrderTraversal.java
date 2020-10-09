package datastructures.trees.traversal;

import datastructures.trees.Node;

public class InOrderTraversal {

    public void inOrder(Node<Integer> node) {
        if (node == null) return;
        inOrder(node.getPrev());
        System.out.println(node.getData());
        inOrder(node.getNext());
    }
}
