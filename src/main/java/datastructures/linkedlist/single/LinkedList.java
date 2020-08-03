package datastructures.linkedlist.single;

//TODO : Remove by value, Find index by Value, Value at index, Contains
public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

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
        return size == 0 ;
    }

    public void add(Node node) {
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public void insertAt(Node node, int position) {
        if (position < 0 || position >= size) {
            throw new IllegalArgumentException("Invalid Position:" + position);
        }
        Node current = head;
        Node prev = null;
        int counter = 0;
        while(current != null) {
            if (counter == position) {
                break;
            }
            prev = current;
            current = current.getNext();
            counter++;
        }

        if (counter != position) {
            throw new RuntimeException("Invalid position:" + position);
        }
        prev.setNext(node);
        node.setNext(current);
        size++;
    }

    public Node get(int position) {
        Node current = head;
        int counter = 0;
        while(current != null) {
            if (counter == position) {
                break;
            }
            current = current.getNext();
            counter++;
        }
        return current;
    }

    public Node remove() {
        Node removableItem;
        if (isEmpty()) {
            throw new RuntimeException("Linked list is empty");
        }

        if (head == tail) {
            removableItem = head;
            head = null;
            tail = null;
            size --;
            return removableItem;
        }

        Node prev = null;
        Node current = head;
        while (current.getNext() != null) {
            prev = current;
            current = current.getNext();
        }
        removableItem = current;
        prev.setNext(null);
        tail = prev;
        size--;
        return removableItem;
    }

    public Node removeAt(int position) {

        if (position <0 || position >= size) {
            throw new IllegalArgumentException("Invalid Position:" + position);
        }

        Node removableItem;
        if (isEmpty()) {
            throw new RuntimeException("Linked list is empty");
        }
        if (head == tail && position != 0) {
            throw new IllegalArgumentException("Invalid Position:" + position);
        }

        if (head == tail) {
            removableItem = head;
            head = null;
            tail = null;
            return removableItem;
        }
        Node current = head;
        Node prev = null;
        int counter = 0;
        while (current.getNext() != null) {
            if (counter == position) {
                break;
            }
            prev = current;
            current = current.getNext();
            counter++;
        }
        if (counter != position) {
            throw new IllegalArgumentException("Invalid Position:" + position);
        }
        removableItem = current;
        prev.setNext(current.getNext());
        size--;
        return removableItem;
    }

    public void clear() {
        if (isEmpty()) {
            return;
        } else {
            Node current = head;
            while (current != null) {
                Node next = current.getNext();
                current.setData(null);
                current.setNext(null);
                current = next;
            }
            head = null;
            tail = null;
            size = 0;
        }
    }
}
