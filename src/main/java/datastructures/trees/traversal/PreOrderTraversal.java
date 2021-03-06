package datastructures.trees.traversal;

import datastructures.trees.Node;

public class PreOrderTraversal {

    public void preOrder(Node<Integer> node) {
        if (node == null) return;
        System.out.println(node.getData());
        preOrder(node.getPrev());
        preOrder(node.getNext());
    }
}
