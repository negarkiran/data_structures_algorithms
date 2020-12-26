package algorithms.string;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CharacterCombinationsInPhoneTest {

    @Test
    public void shouldFindCombinations() {
        CharacterCombinationsInPhone characterCombinationsInPhone = new CharacterCombinationsInPhone();
        List<String> combinations = characterCombinationsInPhone.combinations("234");
        assertEquals(27, combinations.size());
        combinations = characterCombinationsInPhone.combinations("23");
        assertEquals(9, combinations.size());
    }

}