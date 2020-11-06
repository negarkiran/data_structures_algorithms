package datastructures.linkedlist.doubly;

public class ConvertSortedArrayToBinarySearchTree {
    public Node<Integer> sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return convert(nums, 0, nums.length - 1);
    }

    private Node<Integer> convert(int[] nums, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            Node<Integer> currentNode = new Node<>(nums[mid]);
            currentNode.setPrev(convert(nums, start, mid - 1));
            currentNode.setNext(convert(nums, mid + 1, end));
            return currentNode;
        }
        return null;
    }
}
