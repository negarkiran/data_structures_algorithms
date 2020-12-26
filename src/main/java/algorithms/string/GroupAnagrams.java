package algorithms.string;

// Given an array of strings, group anagrams together.

// For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Return:

// [
//   ["ate", "eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]
// Note: All inputs will be in lower-case.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> group(String[] anagrams) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for(String anagram : anagrams) {
            char[] chars = anagram.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> list;
            if (anagramMap.containsKey(key)) {
                list = anagramMap.get(key);
            } else {
                list = new ArrayList<>();
            }
            list.add(anagram);
            anagramMap.put(key, list);
        }
        return new ArrayList<>(anagramMap.values());
    }
}
