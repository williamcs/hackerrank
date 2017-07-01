package hackerrank.ThirtyDays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by will on 7/1/17.
 */
public class Day23_BSTLevelOrder {
    public static void levelOrder(BSTNode root) {
        if (root == null) return;

        Queue<BSTNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            BSTNode node = queue.remove();
            System.out.print(node.data + " ");

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    public static BSTNode insert(BSTNode root, int data) {
        if (root == null) {
            return new BSTNode(data);
        }
        if (data <= root.data) {
            root.left = insert(root.left, data);
            return root;
        } else {
            root.right = insert(root.right, data);
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        BSTNode root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
