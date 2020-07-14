package datastructures.queue;

import java.util.Arrays;
import java.util.Objects;

public class Queue {

    private Integer[] queue;
    private int left;
    private int right;
    private int size;

    public Queue(int size) {
        this.size = size;
        this.right = 0;
        this.left = 0;
        this.queue = new Integer[size];
    }

    public boolean add(Integer number) {
        long itemsLength = Arrays.stream(queue).filter(Objects::nonNull).count();
        if (itemsLength < size) {
            queue[right++] = number;
            return true;
        }
        throw new RuntimeException("Queue Is Full");
    }

    public Integer[] get() {
        return queue;
    }

    public int remove() {
        if (left == right) {
            throw new RuntimeException("Queue is Empty");
        }
        int item = queue[left];
        shift();
        right--;
        return item;
    }

    private void shift() {
        for (int i = 0; i < right; i++) {
            queue[i] = queue[i + 1];
        }
    }
}
