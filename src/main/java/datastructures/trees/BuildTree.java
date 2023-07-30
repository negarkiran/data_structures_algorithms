package datastructures.trees;

import java.util.Arrays;

public class BuildTree {

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, 0, inorder.length - 1);
    }

    public static TreeNode build(int[] preorder, int[] inorder, int prLeft, int inLeft, int inRight) {
        if (prLeft > preorder.length - 1 || inLeft > inRight) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[prLeft]);
        int counter = 0; // Index of current root in inorder
        for (int i = inLeft; i <= inRight; i++) {
            if (inorder[i] == root.val) {
                counter = i;
                break;
            }
        }

        root.left = build(preorder, inorder, prLeft + 1, inLeft, counter - 1);
        root.right = build(preorder, inorder, prLeft + counter - inLeft + 1, counter + 1, inRight);
        return root;

    }


    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode root = buildTree(preorder, inorder);
        System.out.println(root.val);
    }
}
