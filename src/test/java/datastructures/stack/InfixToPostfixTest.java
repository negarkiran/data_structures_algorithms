package datastructures.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InfixToPostfixTest {

    private InfixToPostfix infixToPostfix;

    @Before
    public void setup() {
        infixToPostfix = new InfixToPostfix();
    }

    @Test
    public void shouldConvertInfixToPostfixExpressionOne() {
        String postFix = infixToPostfix.convert("2^3/5*4+10");
        assertEquals("23^5/4*10+", postFix);
    }

    @Test
    public void shouldConvertInfixToPostfixExpressionTwo() {
        String postFix = infixToPostfix.convert("a+b*(c^d-e)^(f+g*h)-i");
        assertEquals("abcd^e-fgh*+^*+i-", postFix);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionForInvalidExpression() {
        String postFix = infixToPostfix.convert("a+b*(c^d-e)^(f+(g*h)-i");
        assertEquals("abcd^e-fgh*+^*+i-", postFix);
    }
}