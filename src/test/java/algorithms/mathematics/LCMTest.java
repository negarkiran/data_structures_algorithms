package algorithms.mathematics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LCMTest {

    @Test
    public void shouldReturnLCM(){
        LCM lcm = new LCM();
        assertEquals(60, lcm.find(20, 15));
        assertEquals(35, lcm.find(5, 7));
    }
}