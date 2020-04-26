package trees;

import java.util.*;

/**
 * Implementation of a basic Binary Tree
 * 
 * @author tonyou
 *
 */

public class TreeNode {
	private int val;
	private TreeNode left;
	private TreeNode right;
	
	/**
	 * TreeNode constructor
	 * 
	 * @param val value in node
	 */
	
	public TreeNode(int val) {
		this.val = val;
		left = right = null;
	}
	
	/**
	 * Insert a node in the tree using recursion
	 * 
	 * @param root the host tree
	 * @param val the value to be inserted
	 * @return the updated tree
	 */
	
	public static TreeNode insert(TreeNode root, int val) {
		if (root == null) {
			TreeNode node = new TreeNode(val);
			return node;
		}
		if (val < root.val) root.left = insert(root.left, val);
		else root.right = insert(root.right, val);
		return root;
	}
	
	/**
	 * Remove a node in the tree using recursion
	 * 
	 * @param root the host tree
	 * @param val the value to be removed
	 * @return the updated tree
	 */
	
	public static TreeNode remove(TreeNode root, int val) {
		if (root == null) return root;
		if (root.val < val) root.right = remove(root.right, val);
		else if (root.val > val) root.left = remove(root.left, val);
		else {
			if (root.right == null) return root.left;
			else if (root.left == null) return root.right;
			else {
				int min = findMin(root.right);
				root.val = min;
				root.right = remove(root.right, min);
			}
		}
		return root;
	}
	
	/**
	 * Helper function to find the minimum value in a tree
	 * 
	 * @param root the host tree
	 * @return the minimum value of the tree
	 */
	
	public static int findMin(TreeNode root) {
		int min = root.val;
		while (root.left != null) {
			min = root.left.val;
			root = root.left;
		}
		return min;
	}
	
	/**
	 * DFT: inorder tree traversal
	 * 
	 * @param root
	 */
	
	public static void inorder(TreeNode root) {
		if (root == null) return;
		inorder(root.left);
		System.out.println(root.val);
		inorder(root.right);
	}
	
	/**
	 * DFT: preorder tree traversal
	 * 
	 * @param root
	 */
	
	public static void preorder(TreeNode root) {
		if (root == null) return;
		System.out.println(root.val);
		preorder(root.left);
		preorder(root.right);
	}
	
	/**
	 * DFT: postorder tree traversal
	 * 
	 * @param root
	 */
	
	public static void postorder(TreeNode root) {
		if (root == null) return;
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.val);
	}
	
	/**
	 * Breadth first tree traversal
	 * 
	 * @param root
	 */
	
	public static void bft(TreeNode root) {
		if (root == null) return;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.remove();
			System.out.println(node.val);
			if (node.left != null) queue.add(node.left);
			if (node.right != null) queue.add(node.right);
		}
	}
	
	public static void main(String args[]) {
		TreeNode root = new TreeNode(5);
		insert(root, 2);
		insert(root, 11);
		insert(root, 1);
		insert(root, 7);
		insert(root, 13);
		remove(root, 2);
		bft(root);
	}
}
