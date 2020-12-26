package algorithms.string;

public class Anagram {
    public boolean isAnagram(String one, String two) {
        if (one.length() != two.length()) {
            return false;
        }
        int asciiOne=0, asciiTwo = 0;
        for (int i = 0; i < one.length(); i++) {
            asciiOne+= one.charAt(i);
            asciiTwo+= two.charAt(i);
        }
        return asciiOne == asciiTwo;
    }
}
