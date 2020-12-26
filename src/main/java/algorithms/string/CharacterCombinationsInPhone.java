package algorithms.string;

import java.util.ArrayList;
import java.util.List;

public class CharacterCombinationsInPhone {
    List<String> mapping = List.of("0", "1", "abc", "def", "ghi", "jkl",
            "mno", "pqr", "stu", "wxyz");

    public List<String> combinations(String digit) {
        List<String> result = new ArrayList<>();
        recursiveCombinations(digit, "", result, 0);
        return result;
    }

    private void recursiveCombinations(String digit, String combination,
                                               List<String> result, int index) {
        if (digit.length() == index) {
            result.add(combination);
            return;
        }
        String letters = mapping.get(digit.charAt(index) - '0');
        for (int i = 0; i < letters.length(); i++) {
            recursiveCombinations(digit, combination + letters.charAt(i),
                    result, index+1);
        }
    }
}
