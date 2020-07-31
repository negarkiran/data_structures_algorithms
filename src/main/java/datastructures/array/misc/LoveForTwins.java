package datastructures.array.misc;

/*
Suppose you have two pets and you love both of them very much. You go to a pet store to buy different articles for your pets. But you ask salesman that you will buy only those articles which are actually in pair. In this store, articles are referred as integers. So you have to tell total no. of articles you will buy for your pets.

Note: Time complexity O(n).

Input :
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Second line contains the no. of articles "N" shown by the salesman.Third line contains N - separated integers describing the articles referred as an integer.

Output :
Total No. of articles you will prefer to buy for your pets.
 */

import java.util.HashMap;
import java.util.Map;

public class LoveForTwins {
    public int numberOfArticles(int[] articles) {
        int length = articles.length;
        int articleCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < length; j++) {
            int input = articles[j];
            if (map.containsKey(articles[j])) {
                int total = map.get(input) + 1;
                if (total == 2){
                    articleCount++;
                    map.remove(input);
                } else {
                    map.put(input, total);
                }

            } else {
                map.put(input, 1);
            }
        }
        return articleCount * 2;
    }
}
