package datastructures.linkedlist.doubly;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    public void shouldConvertSortedArrayToBinarySearchTree() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        ConvertSortedArrayToBinarySearchTree convertSortedArrayToBinarySearchTree =
                new ConvertSortedArrayToBinarySearchTree();
        Node<Integer> binarySearchTree =
                convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums);
        assertEquals(3, binarySearchTree.getData(), 0);
        assertEquals(1, binarySearchTree.getPrev().getData(), 0);
        assertEquals(2, binarySearchTree.getPrev().getNext().getData(), 0);
        assertEquals(5, binarySearchTree.getNext().getData(), 0);
        assertEquals(4, binarySearchTree.getNext().getPrev().getData(), 0);
        assertEquals(6, binarySearchTree.getNext().getNext().getData(), 0);
    }
}