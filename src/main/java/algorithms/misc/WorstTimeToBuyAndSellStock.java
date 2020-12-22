package algorithms.misc;

public class WorstTimeToBuyAndSellStock {
    public int buyAndSell(int[] array) {
        int n = array.length;

        if (n == 0)
            return 0;
        if (n == 1)
            return array[0];

        int min = 0;
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < max) {
                min = Math.min(array[i] - max, min);
            } else {
                max = array[i];
            }
        }
        return min;
    }
}
