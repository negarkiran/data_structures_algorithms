package algorithms.search;

//Time Complexity: O(n)
//Works for any array Sorted | Unsorted
public class LinearSearch {
    public int search(int[] array, int item){
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] == item){
                return i;
            }
        }
        return -1;
    }
}
