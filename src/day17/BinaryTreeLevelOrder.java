package day17;

import java.util.*;
class TreeNode {
	int val;
	TreeNode left, right;
	TreeNode(int val) {
		this.val = val;
		this.left = this.right = null;
	}
}
public class BinaryTreeLevelOrder {
	public static TreeNode buildTreeLevelOrder(Scanner sc) {
		System.out.println("Enter root value (or -1 for null): ");
		int val = sc.nextInt();
		if (val == -1) return null;
		TreeNode root = new TreeNode(val);
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode current = queue.poll();
			System.out.println("Enter left child of " + current.val + " (-1 for null):");
			int leftVal = sc.nextInt();
			if (leftVal != -1) {
				current.left = new TreeNode(leftVal);
				queue.add(current.left);
			}
			System.out.println("Enter right child of " + current.val + " (-1 for null):");
			int rightVal = sc.nextInt();
			if (rightVal != -1) {
				current.right = new TreeNode(rightVal);
				queue.add(current.right);
			}
		}
		return root;
	}
	public static void levelOrder(TreeNode root) {
		if (root == null) return;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			System.out.print(node.val + " ");
			if (node.left != null) queue.add(node.left);
			if (node.right != null) queue.add(node.right);
		}
	}
}