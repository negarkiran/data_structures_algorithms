package algorithms.mathematics;

public class BinaryGap {
    public int gap(int n) {
        String binary = Integer.toBinaryString(n);
        int maxGap = 0;
        int gap = 0;
        for (int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') {
                if (gap > maxGap) {
                    maxGap = gap;
                }
                gap = 0;
            } else {
                gap++;
            }
        }
        return maxGap;
    }
}
