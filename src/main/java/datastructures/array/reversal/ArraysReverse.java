package datastructures.array.reversal;

public class ArraysReverse {
    private int[] numbers;
    private int size;

    public ArraysReverse(int size) {
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

    public void reverse() {
        int temp, start = 0, end = size -1;
        while (start <= end) {
            temp = numbers[start];
            numbers[start++] = numbers[end];
            numbers[end--] = temp;
        }
    }
}
