package datastructures.trees;

import java.util.Stack;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaxDepthBinaryTree {

    class Depth {
        TreeNode treeNode;
        int value;
        Depth(TreeNode node, int val) {
            this.treeNode = node;
            this.value = val;
        }
    }

    public int maxDepth(TreeNode root) {

        if(root == null)
            return 0;

        Stack<Depth> stack = new Stack<>();
        int res = 1;
        stack.push(new Depth(root, 1));

        while (!stack.isEmpty()) {
            Depth depth = stack.pop();

            if(depth.treeNode != null) {
                res = Math.max(res, depth.value);
                stack.push(new Depth(depth.treeNode.left, depth.value + 1));
                stack.push(new Depth(depth.treeNode.right, depth.value + 1));
            }
        }
        return res;
    }
}
