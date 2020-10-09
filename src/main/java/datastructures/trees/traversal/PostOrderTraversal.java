package datastructures.trees.traversal;

import datastructures.trees.Node;

public class PostOrderTraversal {

    public void postOrder(Node<Integer> node) {
        if (node == null) return;
        postOrder(node.getPrev());
        postOrder(node.getNext());
        System.out.println(node.getData());
    }
}
