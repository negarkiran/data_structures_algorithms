package algorithms.dynamic_programming;

//Let 1 represent ‘A’, 2 represents ‘B’, etc.
// Given a digit sequence, count the number of possible decodings of the given digit sequence.

public class PossibleDecoding {
    public int countPossibilities(char[] digits) {

        int n = digits.length;
        int[] count = new int[n + 1];
        count[0] = 1;
        count[1] = 1;
        if (digits[0] == '0')
            return 0;
        for (int i = 2; i <= n; i++) {
            if (digits[i - 1] > '0') {
                count[i] = count[i - 1];
            }

            if (digits[i - 2] == '1' ||
                    (digits[i - 2] == '2' && digits[i - 1] < '7')) {
                count[i] += count[i - 2];
            }
        }
        return count[n];
    }
}
