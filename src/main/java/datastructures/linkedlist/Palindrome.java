package datastructures.linkedlist;

public class Palindrome {
    private LinkedList linkedList;

    public Palindrome() {
        this.linkedList = new LinkedList();
    }

    public LinkedList getLinkedList() {
        return linkedList;
    }

    public boolean isPalindrome() {
        Node head = linkedList.getHead();

        if(head == null || head.getNext() == null)
            return true;

        Node slowPointer = head;
        Node fastPointer = head;
        Node firstHalf = head;
        Node secondHalf = null;

        while (fastPointer != null && fastPointer.getNext()!=null) {
            fastPointer = fastPointer.getNext().getNext();
            slowPointer = slowPointer.getNext();
        }

        if(fastPointer != null) {
            slowPointer = slowPointer.getNext();
        }

        secondHalf = reverseUsingIteration(slowPointer);

        while (firstHalf != null && secondHalf != null) {
            if(Integer.valueOf(firstHalf.getData()) != Integer.valueOf(secondHalf.getData())) {
                return false;
            }
            secondHalf = secondHalf.getNext();
            firstHalf = firstHalf.getNext();
        }

        return true;

    }

    private Node reverseUsingIteration(Node head) {
        if(head.getNext() == null) {
            return head;
        }
        Node currentNode = head;
        Node nextNode;
        Node previousNode = null;

        while(currentNode != null) {
            nextNode = currentNode.getNext();
            currentNode.setNext(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }
}
