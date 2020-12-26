package algorithms.misc;

import java.util.HashMap;
import java.util.Map;

public class EncodeDecodeTinyUrl {

    Map<Integer, String> map = new HashMap<>();
    int count = 0;

    public String encode(String longUrl) {
        map.put(count, longUrl);
        return "http://tinyurl.com/" + count++;
    }

    public String decode(String tinyUrl) {
        String key = tinyUrl.replace("http://tinyurl.com/", "");
        return map.get(Integer.valueOf(key));
    }
}
