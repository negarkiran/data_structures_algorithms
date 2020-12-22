package algorithms.misc;

public class BestTimeToBuyAndSellStock {
    public int buyAndSell(int[] array) {
        int n = array.length;

        if(n == 0)
            return 0;
        if (n==1)
            return array[0];

        int min = array[0];
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] > min) {
                max = Math.max(array[i] - min, max);
            } else {
                min = array[i];
            }
        }
        return max;
    }
}
