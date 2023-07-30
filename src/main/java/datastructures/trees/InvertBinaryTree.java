package datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/invert-binary-tree/
public class InvertBinaryTree {

    public static void invertTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode cur = queue.peek();

            if (cur.left != null) queue.offer(cur.left);
            if (cur.right != null) queue.offer(cur.right);

            cur = queue.poll();
            TreeNode temp = cur.right;
            cur.right = cur.left;
            cur.left = temp;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        invertTree(root);
    }
}
