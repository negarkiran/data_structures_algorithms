package datastructures.linkedlist.single;

public class Cycle {
    public boolean hasCycle(Node<Integer> root) {
        if (root == null || root.getNext() == null) {
            return false;
        }

        Node slow = root;
        Node fast = root.getNext();

        while (fast != null && fast.getNext() != null && fast != slow) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return fast == slow;
    }
}
