package algorithms.mathematics;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FindFibonacciNumberTest {

    @Test
    public void shouldFindIfANumberIsFibonacciNumber() {
        FindFibonacciNumber findFibonacciNumber = new FindFibonacciNumber();
        assertTrue(findFibonacciNumber.isFibonacci(5));
        assertFalse(findFibonacciNumber.isFibonacci(6));
    }

}