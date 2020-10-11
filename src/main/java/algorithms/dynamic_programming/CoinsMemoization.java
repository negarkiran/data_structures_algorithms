package algorithms.dynamic_programming;

/*
In Byteland they have a very strange monetary system.

Each Bytelandian gold coin has an integer number written on it.
A coin n can be exchanged in a bank into three coins: n/2, n/3 and n/4.
But these numbers are all rounded down (the banks have to make a profit).

You can also sell Bytelandian coins for American dollars.
The exchange rate is 1:1. But you can not buy Bytelandian coins.

You have one gold coin. What is the maximum amount of American dollars you can get for it?
*/

public class CoinsMemoization {

    static long[] state = new long[10000];

    public long americanDollars(int n) {
        if(n<10)
            return n;

        if(state[n] !=0) {
            return state[n];
        }

        long x = americanDollars(n/2) + americanDollars(n/3) + americanDollars(n/4);
        state[n] = Math.max(x, n);
        return state[n];
    }
}
