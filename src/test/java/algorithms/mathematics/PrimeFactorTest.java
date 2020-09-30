package algorithms.mathematics;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeFactorTest {
    @Test
    public void shouldGetPrimeFactors(){
        PrimeFactor primeFactor = new PrimeFactor();
        List<Integer> factors = primeFactor.primeFactors(12);
        assertEquals(3, factors.size());

        factors = primeFactor.primeFactors(315);
        assertEquals(4, factors.size());
    }

}