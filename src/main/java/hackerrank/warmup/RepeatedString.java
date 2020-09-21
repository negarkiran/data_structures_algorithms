package hackerrank.warmup;

//Lilah has a string, s , of lowercase English letters that she repeated infinitely many times.
//Given an integer, n , find and print the number of letter a's in the first  letters of Lilah's infinite string.
//For example, if the string s = 'abcac' and n=10, the substring we consider is 'abcacabcac', the first 10 characters of her infinite string.
// There are 4 occurrences of a in the substring.

import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long stringLength = s.length();
        if (!s.contains("a")) {
            return 0;
        }
        if (stringLength == 0) {
            return 0;
        }
        if (stringLength == 1) {
            return n;
        }

        long aLength = 0;
        for (int i = 0; i < stringLength; i++) {
            if (s.charAt(i) == 'a') {
                aLength++;
            }
        }

        long repetitionCount = (n / stringLength) * aLength;
        long modulo = n % stringLength;

        for (int j = 0; j < modulo; j++) {
            if(s.charAt(j) == 'a') {
                repetitionCount++;
            }
        }
        return repetitionCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(repeatedString(s, n));

        scanner.close();
    }
}
