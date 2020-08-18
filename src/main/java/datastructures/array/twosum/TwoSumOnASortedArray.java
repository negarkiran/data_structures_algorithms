package datastructures.array.twosum;


//Write a program that, given an array A[] of n numbers and another number x,
// determines whether or not there exist two elements in S whose sum is exactly x.
public class TwoSumOnASortedArray {
    public boolean hasSumInArray(int[] array, int sum) {
        int length = array.length;
        int left = 0, right = length -1;
        while (left < right) {
            if (array[left] + array[right] == sum) {
                return true;
            }
            if (array[left] + array[right] < sum){
                left++;
            } else {
                right --;
            }
        }
        return false;
    }
}
