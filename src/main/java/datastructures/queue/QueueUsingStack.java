package datastructures.queue;


import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> stackOne = new Stack<>();
    private Stack<Integer> stackTwo = new Stack<>();

    public void enqueue(Integer item) {
        while (!stackOne.isEmpty()) {
            stackTwo.push(stackOne.pop());
        }

        stackOne.push(item);

        while (!stackTwo.isEmpty()) {
            stackOne.push(stackTwo.pop());
        }
    }

    public Integer dequeue() {
        if (stackOne.isEmpty()) {
            throw new RuntimeException("Queue is Empty !");
        }
        return stackOne.pop();
    }
}
