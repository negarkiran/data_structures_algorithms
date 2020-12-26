package algorithms.string;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GroupAnagramsTest {

    @Test
    public void shouldGroupAnagrams() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] anagrams = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> group = groupAnagrams.group(anagrams);
        assertEquals(3, group.get(0).size());
        assertEquals(1, group.get(1).size());
        assertEquals(2, group.get(2).size());
    }

}