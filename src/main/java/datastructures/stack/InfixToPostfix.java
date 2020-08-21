package datastructures.stack;

import java.util.Stack;

public class InfixToPostfix {
    private static int precedence(Character ch) {
        switch (ch) {
            case ('+'):
            case ('-'):
                return 1;
            case ('*'):
            case ('/'):
                return 2;
            case ('^'):
                return 3;
            default:
                return -1;
        }
    }

    public String convert(String infix) {
        int n = infix.length();
       java.util.Stack<Character> stack = new Stack<>();

       StringBuilder postFix = new StringBuilder();
        for (int i = 0; i < n; i++) {
            Character ch = infix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postFix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postFix.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() != '(') {
                    throw new RuntimeException("Invalid Expression");
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    if (stack.peek() == '('){
                        throw new RuntimeException("Invalid Expression");
                    }
                    postFix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '('){
                throw new RuntimeException("Invalid Expression");
            }
            postFix.append(stack.pop());
        }

        return postFix.toString();
    }
}
