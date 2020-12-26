package algorithms.misc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncodeDecodeTinyUrlTest {

    @Test
    public void shouldBeAbleToGenerateTinyUrlAndGetLongUrlBack() {
        EncodeDecodeTinyUrl encodeDecodeTinyUrl = new EncodeDecodeTinyUrl();
        assertEquals("http://tinyurl.com/0",
                encodeDecodeTinyUrl.encode("https://longUrl.com/long"));
        assertEquals("http://tinyurl.com/1",
                encodeDecodeTinyUrl.encode("https://longUrl.com/longest"));
        assertEquals("https://longUrl.com/long",
                encodeDecodeTinyUrl.decode("http://tinyurl.com/0"));
        assertEquals("https://longUrl.com/longest",
                encodeDecodeTinyUrl.decode("http://tinyurl.com/1"));
    }
}