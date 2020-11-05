package algorithms.search;

public class FrontBackSearch {
    public boolean isPresent(int[] arr, int item) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            if (arr[left] == item || arr[right] == item) {
                return true;
            }
            left++;
            right--;
        }
        return false;
    }
}
