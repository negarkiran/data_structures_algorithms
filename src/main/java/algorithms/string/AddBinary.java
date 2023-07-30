package algorithms.string;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

//https://leetcode.com/problems/add-binary/
public class AddBinary {
    public static String addBinary(String a, String b) {
        int maxLength = Math.max(a.length(), b.length());

        if (a.length() < maxLength) {
            a = fillZeros(a, maxLength - a.length());
        } else {
            b = fillZeros(b, maxLength - b.length());
        }

        int[] result = new int[maxLength + 1];
        int carry = 0;
        int sum = 0;

        for (int i = maxLength - 1; i >= 0; i--) {
            sum = carry + Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i));
            carry = sum / 2;
            result[i+1] = sum % 2;
        }
        result[0] = carry;

        return Arrays
                .stream(result)
                .mapToObj(String::valueOf)
                .reduce((m, n) -> m.concat("").concat(n))
                .get();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    private static String fillZeros(String input, int length) {
        StringBuilder stringBuilder = new StringBuilder();
        while (stringBuilder.length() != length) {
            stringBuilder.append("0");
        }
        stringBuilder.append(input);
        return stringBuilder.toString();
    }
}
