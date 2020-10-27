package algorithms.mathematics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinomialCoefficientTest {

    @Test
    public void shouldFindBinomialCoefficient(){
        BinomialCoefficient binomialCoefficient = new BinomialCoefficient();
        assertEquals(6, binomialCoefficient.binomialCoefficient(4,2));
    }

}