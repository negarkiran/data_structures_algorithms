package algorithms.string;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidateParenthesisTest {
    @Test
    public void shouldValidateThatTheStringHasValidParenthesis() {
        ValidateParenthesis validateParenthesis = new ValidateParenthesis();
        assertTrue(validateParenthesis.validate("({[]})"));
    }

    @Test
    public void shouldValidateThatTheStringHasInvalidParenthesis() {
        ValidateParenthesis validateParenthesis = new ValidateParenthesis();
        assertFalse(validateParenthesis.validate("({[(]]})"));
    }
}