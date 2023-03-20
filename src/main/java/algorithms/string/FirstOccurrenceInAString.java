package algorithms.string;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class FirstOccurrenceInAString {
    public static int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        int haystackLength = haystack.length();
        if (needleLength == 0 || needleLength > haystackLength) return -1;

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if(haystack.substring(i, i+needleLength).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("a", "a"));
    }
}
