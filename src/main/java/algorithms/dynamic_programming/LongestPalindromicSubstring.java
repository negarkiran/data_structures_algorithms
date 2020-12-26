package algorithms.dynamic_programming;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String string) {
        if (string == null || string.length() == 0)
            return "";

        int n = string.length();
        String longestPalindrome = "";
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (j-i > longestPalindrome.length() && isPalindrome(string.substring(i, j))){
                    longestPalindrome = string.substring(i, j);
                }
            }

        }
        return longestPalindrome;
    }

    private boolean isPalindrome(String string) {
        if (string != null
                && (string.length() == 0 || string.length() == 1))
            return false;

        int i = 0;
        int j = string.length() - 1;
        while (i<=j) {
            if(string.charAt(i++) != string.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

}
