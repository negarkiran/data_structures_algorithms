package datastructures.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PalindromeTest {

    @Test
    public void shouldReturnTrueForPalindrome() {
        Palindrome palindrome = new Palindrome();
        palindrome.getLinkedList().add(new Node(1));
        palindrome.getLinkedList().add(new Node(2));
        palindrome.getLinkedList().add(new Node(2));
        palindrome.getLinkedList().add(new Node(1));

        assertTrue(palindrome.isPalindrome());

    }

}