package algorithms.mathematics;

//Fibonacci number property : (5n^2 + 4) || (5n^2 - 4) is a perfect square
public class FindFibonacciNumber {
    public boolean isFibonacci(int num) {
        return isPerfectSquare(5*num*num + 4)
                || isPerfectSquare(5*num*num - 4);
    }

    private boolean isPerfectSquare(int x) {
        int sqrt = (int)Math.sqrt(x);
        return sqrt * sqrt == x;
    }
}
