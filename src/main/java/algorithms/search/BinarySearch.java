package algorithms.search;

public class BinarySearch {
    public int search(int[] array, int number) {
        int n = array.length;
        int left = 0;
        int right = n - 1;
        int mid;

        while (left <= right) {
            mid = (left + right - 1) / 2;
            if (array[mid] == number) {
                return mid;
            } else if (array[mid] > number) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
