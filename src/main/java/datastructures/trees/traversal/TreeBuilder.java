package datastructures.trees.traversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class TreeBuilder {
    static class Node {
        int value;
        Node left;
        Node right;
        Node(int val) {
            this.value = val;
            this.left = null;
            this.right = null;
        }
    }
    public static Node buildTree(Node root) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the data to insert");
        int data = scanner.nextInt();

        root = new Node(data);
        if (data == -1) {
            return null;
        }

        System.out.printf("Inserted data: %d to left tree%n", data);
        root.left = buildTree(root.left);
        System.out.printf("Inserted data: %d to right tree%n", data);
        root.right = buildTree(root.right);
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        root = buildTree(root);
        List<List<Integer>> result = levelOrder(root);
        System.out.println("Done");
    }

    private static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> level = new LinkedList<>();
        Queue<Node> queue = new LinkedList<>();

        if (root == null) return null;

        queue.offer(root);

        while (!queue.isEmpty()) {

            List<Integer> subRes = new LinkedList<>();
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                Node cur = queue.peek();
                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);

                subRes.add(queue.poll().value);
            }
            level.add(subRes);
        }
        return level;
    }
}
