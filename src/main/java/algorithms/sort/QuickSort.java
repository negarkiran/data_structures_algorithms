package algorithms.sort;

public class QuickSort {
    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                //Swap using bitwise operators
                arr[i] ^= arr[j];
                arr[j] ^= arr[i];
                arr[i] ^= arr[j];
            }
        }
        arr[i + 1] ^= arr[high];
        arr[high] ^= arr[i + 1];
        arr[i + 1] ^= arr[high];
        return i + 1;
    }
}
