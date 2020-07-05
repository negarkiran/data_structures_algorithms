package algorithms.sort;

public class BubbleSort {
    public void sort(int[] input) {
        int n = input.length;
        int temp;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                    swapped=true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}
