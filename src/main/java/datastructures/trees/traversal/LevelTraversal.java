package datastructures.trees.traversal;

import datastructures.trees.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelTraversal {
    public List<Integer> traverse(Node<Integer> root) {
        if (root == null) return null;
        Queue<Node<Integer>> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node<Integer> current = queue.remove();
            result.add(current == null ? null : current.getData());
            if (current != null) {
                queue.add(current.getPrev());
                queue.add(current.getNext());
            }
        }
        return result;
    }
}
