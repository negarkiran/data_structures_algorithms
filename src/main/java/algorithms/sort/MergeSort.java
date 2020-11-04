package algorithms.sort;

public class MergeSort {
    public void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            //sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            //merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    private void merge(int[] arr, int l, int m, int r) {

        //find size of 2 sub arrays
        int n1 = m - l + 1;
        int n2 = r - m;

        //create 2 temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];


        //Copy data to temp arrays
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }

        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        //Merge the 2 arrays
        int i = 0, j = 0;

        //Initial index of merged sub array
        int k = l;

        while (i < n1 && j < n2) {
            //choose smaller element first
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //Copy remaining values
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
