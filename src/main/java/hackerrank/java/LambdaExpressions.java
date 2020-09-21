package hackerrank.java;

import java.math.BigInteger;

interface PerformOperation{
    boolean check(int num);
}

public class LambdaExpressions {
    public static PerformOperation isOdd(){
        return (int a) -> a % 2 != 0;
    }

    public static PerformOperation isPrime(){
        return (int a) -> BigInteger.valueOf(a).isProbablePrime(1);
    }

    public static PerformOperation isPalindrome(){
        return (int n) -> Integer.toString(n).equals( new StringBuilder(Integer.toString(n)).reverse().toString() );
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome().check(12321));
    }
}
