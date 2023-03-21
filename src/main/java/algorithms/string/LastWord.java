package algorithms.string;

//https://leetcode.com/problems/length-of-last-word/
public class LastWord {
    public static int lengthOfLastWord(String s) {
        int length = s.length() - 1;
        int wordLength = 0;
        for (int i = length; i >= 0; i--) {
            if(s.charAt(i) != ' '){
                wordLength++;
            } else {
                if (wordLength > 0) {
                    break;
                }
            }
        }
        return wordLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World   "));
    }

}
