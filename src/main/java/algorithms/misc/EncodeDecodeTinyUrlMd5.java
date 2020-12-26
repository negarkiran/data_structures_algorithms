package algorithms.misc;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public class EncodeDecodeTinyUrlMd5 {

    Map<String, String> map = new HashMap<>();
    String characters = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String encode(String longUrl) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] digest = messageDigest.digest(longUrl.getBytes(StandardCharsets.UTF_8));
        String hash = String.format("%032X", new BigInteger(1, digest));
        StringBuilder tiny = new StringBuilder();

        for (int i =0; i< 7; i++) {
            tiny.append(characters.charAt(hash.charAt(i) % 62));
        }

        map.put(tiny.toString(), longUrl);
        return "http://tinyurl.com/" + tiny.toString();
    }

    public String decode(String tinyUrl) {
        String key = tinyUrl.replace("http://tinyurl.com/", "");
        return map.get(key);
    }
}
