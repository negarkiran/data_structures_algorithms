package datastructures.linkedlist.single;

// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
// Input: (2 -> 4 -> 3 = 342) + (5 -> 6 -> 4 = 465)
// Output: 7 -> 0 -> 8 (342 + 465 = 807)

public class AddTwoNumbers {
    public Node<Integer> add(Node<Integer> l1, Node<Integer> l2) {

        Node<Integer> current1 = l1;
        Node<Integer> current2 = l2;

        Node<Integer> head = new Node<>(0);
        ;
        Node<Integer> currentHead = head;

        int sum = 0;
        while (current1 != null || current2 != null) {
            sum /= 10;
            if (current1 != null) {
                sum += current1.getData();
                current1 = current1.getNext();
            }

            if (current2 != null) {
                sum += current2.getData();
                current2 = current2.getNext();
            }

            currentHead.setNext(new Node<>(sum % 10));
            currentHead = currentHead.getNext();
        }

        if (sum / 10 == 1) {
            currentHead.setNext(new Node<>(1));
        }
        return head.getNext();
    }
}
