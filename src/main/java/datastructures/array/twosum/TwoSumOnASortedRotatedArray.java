package datastructures.array.twosum;


//Given an array that is sorted and then rotated around an unknown point. Find if the array has a pair with a given sum ‘x’.
// It may be assumed that all elements in the array are distinct.
public class TwoSumOnASortedRotatedArray {
    public boolean hasSumInArray(int[] array, int sum) {
        int length = array.length;
        int i;
        for (i = 0; i < length-1; i++) {
            if (array[i] > array[i+1]) {
                break;
            }
        }

        int left = (i+1)%length, right = i;
        while (left != right) {
            if (array[left] + array[right] == sum) {
                return true;
            }
            if (array[left] + array[right] < sum){
                left = (left + 1) % length;
            } else {
                right = (length + right - 1) % length;
            }
        }
        return false;
    }
}
