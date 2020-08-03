package datastructures.linkedlist.single;

public class ReverseLinkedList {
    private LinkedList linkedList;

    public ReverseLinkedList() {
        this.linkedList = new LinkedList();
    }

    public LinkedList getLinkedList() {
        return linkedList;
    }

    public Node reverse() {
        Node head = linkedList.getHead();

        Node previous = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        return previous;
    }
}
