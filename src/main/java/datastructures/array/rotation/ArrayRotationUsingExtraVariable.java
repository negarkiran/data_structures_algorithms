package datastructures.array.rotation;

import java.util.Arrays;

//Time complexity : O(n * d)
//Auxiliary Space : O(1)

public class ArrayRotationUsingExtraVariable {
    private int[] numbers;
    private int size;

    public ArrayRotationUsingExtraVariable(int n) {
        this.numbers = new int[n];
        this.size = 0;
    }

    public void add(int n) {
        numbers[size++] = n;
    }

    public int[] getRotatedArray() {
        return Arrays.copyOf(numbers, numbers.length);
    }

    public void rotate(int k) {
        for (int i = 0; i < k; i++) {
            rotateByOne();
        }
    }

    public void rotateByOne(){
        int temp = numbers[0];
        int i;
        for (i = 0; i < size-1; i++) {
            numbers[i] = numbers[i+1];
        }
        numbers[i] = temp;
    }
}
