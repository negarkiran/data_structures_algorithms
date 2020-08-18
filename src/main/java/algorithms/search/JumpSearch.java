package algorithms.search;

//Works for Sorted array
//Time Complexity : O(sqrt(n))
public class JumpSearch {
    public int search(int[] array, int item) {
        //Find steps to jump
        int length = array.length;
        int step = (int) Math.floor(Math.sqrt(array.length));

        int index = 0;
        while (index <= length) {
            if (array[index] < item) {
                index += step;
            } else {
                index -= step;
                break;
            }
        }
        if (index >= length){
            return -1;
        }

        return linearSearch(array, index, index + step, item);
    }

    private int linearSearch(int[] array, int index, int till, int item) {
        for (int i = index; i <= till; i++) {
            if (array[i] == item) {
                return i;
            }
        }
        return -1;
    }
}
