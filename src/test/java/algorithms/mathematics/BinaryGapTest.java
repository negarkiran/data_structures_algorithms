package algorithms.mathematics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryGapTest {
    @Test
    public void shouldReturnMaxGap(){
        BinaryGap binaryGap = new BinaryGap();
        assertEquals(5,  binaryGap.gap(1041));
    }

}