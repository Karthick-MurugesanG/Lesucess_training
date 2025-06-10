package day17;
import java.util.*;
public class TreeMain {
	 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 TreeNode root = BinaryTreeLevelOrder.buildTreeLevelOrder(sc);
	 System.out.print("Level Order Traversal: ");
	 BinaryTreeLevelOrder.levelOrder(root);
	 System.out.println();
	 int leafCount = CountLeafNodes.countLeaves(root);
	 System.out.println("Leaf Nodes: " + leafCount);
	 int height = TreeHeight.findHeight(root);
	 System.out.println("Tree Height: " + height);
	 }
}