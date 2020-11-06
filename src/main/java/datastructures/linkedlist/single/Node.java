package datastructures.linkedlist.single;


//Used for Singly LinkedList
public class Node <T> {
    private T data;
    private Node<T> next;

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
