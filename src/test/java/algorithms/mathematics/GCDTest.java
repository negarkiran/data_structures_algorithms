package algorithms.mathematics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GCDTest {

    @Test
    public void shouldReturnGCD(){
        GCD gcd = new GCD();
        assertEquals(4, gcd.find(20, 28));
        assertEquals(1, gcd.find(5, 7));
    }

}