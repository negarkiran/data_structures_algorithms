package hackerrank.warmup;

import org.junit.Test;

public class ReturnSmallestPositiveIntegerTest {

    @Test
    public void test() {
        ReturnSmallestPositiveInteger returnSmallestPositiveInteger = new ReturnSmallestPositiveInteger();
        int[] A = {-1, 1};
        System.out.println(returnSmallestPositiveInteger.solution(A));
    }
}