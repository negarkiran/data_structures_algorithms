package datastructures.array.arrangement;


//Given an array of random numbers, Push all the zero’s of a given array to the end of the array.
// For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0},
// it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements should be same.
// Expected time complexity is O(n) and extra space is O(1).
public class MoveZerosToEnd {

    public void move(int[] array, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                array[count++] = array[i];
            }
        }

        while (count < n) {
            array[count++] = 0;
        }
    }
}
