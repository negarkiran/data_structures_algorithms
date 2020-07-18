package datastructures.array.reversal;

public class ArraysReverseRecursion {
    private int[] numbers;
    private int size;

    public ArraysReverseRecursion(int size) {
        this.size = 0;
        this.numbers = new int[size];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void add(int n) {
        if (size == numbers.length) {
            return;
        }
        numbers[size++] = n;
    }

    public void reverse(int start, int end) {
        int temp;
        if (start >= end)
            return;

        temp = numbers[start];
        numbers[start] = numbers[end];
        numbers[end] = temp;
        reverse(start + 1, end - 1);
    }
}
