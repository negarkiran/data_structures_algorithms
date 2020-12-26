package algorithms.mathematics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BIggestTwoDigitNumber {
    public int solution(String S) {
        List<Integer> list = new ArrayList<>();
        if (S.length() == 2) {
            return Integer.parseInt(S);
        }
        for (int i = 0; i < S.length() - 1; i++) {
            list.add(Integer.parseInt(S.substring(i, i+2)));
        }

        return Collections.max(list);
    }
}
