package algorithms.matrix;

import org.junit.Test;

public class CostMatrixTest {

    @Test
    public void test() {
        CostMatrix costMatrix = new CostMatrix();
        int[] A = {16,15,14,13,12,11,10};
        System.out.println(costMatrix.solution(A));
    }

}