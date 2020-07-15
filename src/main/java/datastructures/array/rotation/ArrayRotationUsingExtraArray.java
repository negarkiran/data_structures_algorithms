package datastructures.array.rotation;

import java.util.Arrays;

//Time complexity : O(n + d)
//Auxiliary Space : O(n)

public class ArrayRotationUsingExtraArray {
    private int[] numbers;
    private int[] shifted;
    private int size;

    public ArrayRotationUsingExtraArray(int n) {
        this.numbers = new int[n];
        this.shifted = new int[n];
        this.size = 0;
    }

    public void add(int n) {
        numbers[size++] = n;
    }

    public int[] getShifted() {
        return Arrays.copyOf(shifted, shifted.length);
    }

    public void rotate(int k) {
        int j=0;
        for (j = 0; j < size-k; j++) {
            shifted[j] = numbers[j+k];
        }

        for (int i = 0; i < k; i++) {
            shifted[j] = numbers[i];
        }
    }
}
