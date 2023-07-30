package algorithms.string;

import java.util.Stack;

public class ValidateParenthesis {
    private Stack<Character> stack = new Stack<>();

    public boolean validate(String input) {
        int length = input.length();
        if (length % 2 == 1) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[') {
                stack.push(input.charAt(i));
            } else if (input.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (input.charAt(i) == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (input.charAt(i) == '}' && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
