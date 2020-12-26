package algorithms.misc;

import org.junit.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.assertEquals;

public class EncodeDecodeTinyUrlMd5Test {

    @Test
    public void shouldEncodeUrl() throws NoSuchAlgorithmException {
        EncodeDecodeTinyUrlMd5 encodeDecodeTinyUrlMd5 = new EncodeDecodeTinyUrlMd5();
        assertEquals("http://tinyurl.com/TOOOPVQ",
                encodeDecodeTinyUrlMd5.encode("https://longUrl.com/long"));
        assertEquals("http://tinyurl.com/8TNRPU6",
                encodeDecodeTinyUrlMd5.encode("https://longUrl.com/longest"));
        assertEquals("https://longUrl.com/long",
                encodeDecodeTinyUrlMd5.decode("http://tinyurl.com/TOOOPVQ"));
        assertEquals("https://longUrl.com/longest",
                encodeDecodeTinyUrlMd5.decode("http://tinyurl.com/8TNRPU6"));
    }

}