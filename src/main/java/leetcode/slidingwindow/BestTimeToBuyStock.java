package leetcode.slidingwindow;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyStock {
    public static int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int maxProfit = 0, buy = 0, sell = 1;

        while (buy < sell && sell < prices.length) {
            maxProfit = Math.max(maxProfit, prices[sell] - prices[buy]);
            if (prices[sell] < prices[buy]) {
                buy = sell;
                sell++;
            }
            else{
                sell++;
            }
        }
        return maxProfit > 0 ? maxProfit : 0;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
