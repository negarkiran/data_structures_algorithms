package datastructures.linkedlist.doubly;

//TODO : Remove by value, Find index by Value, Value at index, Contains
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        size ++;
    }

    public void addFirst(Node node) {
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            head.setPrev(node);
            node.setNext(head);
            head = node;
        }
        size ++;
    }

    public Node removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        Node removableItem = tail;
        tail = tail.getPrev();
        tail.setNext(null);
        size --;
        return removableItem;
    }

    public Node removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        Node removableItem = head;
        head = head.getNext();
        size--;

        if(isEmpty()){
            tail = null;
        } else {
            head.setPrev(null);
        }

        return removableItem;
    }

    public Node insertAt(Node node, int position) {

        if (position < 0 || position > size) {
            throw new IllegalArgumentException("Invalid Position:" + position);
        }

        Node current = head;
        int counter = 0;
        while (current != null) {
            if (counter == position){
                break;
            }
            current = current.getNext();
            counter++;
        }

        if (counter != position) {
            throw new RuntimeException("Invalid Position:" + position);
        }

        if (current == null) {
            addLast(node);
            return node;
        }

        current.getPrev().setNext(node);
        node.setPrev(current.getPrev());
        node.setNext(current);
        current.setPrev(node);
        size++;
        return node;
    }
}
