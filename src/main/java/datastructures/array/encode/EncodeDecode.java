package datastructures.array.encode;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
    public static String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strs) {
            stringBuilder.append(str.length()).append("#").append(str);
        }
        return stringBuilder.toString();
    }

    public static List<String> decode(String str) {
        int length = str.length();
        int strLen;
        List<String> result = new ArrayList<>();
        for(int i = 0; i< length;) {
            strLen = Character.getNumericValue(str.charAt(i));
            result.add(str.substring(i+2, i+2+strLen));
            i = i + strLen + 2;
        }

        /*while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;

            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length;
            list.add(str.substring(j + 1, i));
        }*/

        return null;
    }

    public static void main(String[] args) {
        System.out.println(encode(List.of("hello", "how", "are", "you")));
        List res = decode(encode(List.of("hello", "how", "are", "you")));
    }
}
