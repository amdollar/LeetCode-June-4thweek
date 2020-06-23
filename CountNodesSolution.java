package com.leetcode.week4;

import java.util.ArrayList;
import java.util.List;

public class CountNodesSolution {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
//		inorder(root);j
		System.out.println("Total number of nodes : " + countNodes(root));
	}

	private static void inorder(TreeNode rootNode, List<Integer> treeList) {
		if (rootNode == null)
			return;
		System.out.println(rootNode.val);
		treeList.add(rootNode.val);

		inorder(rootNode.left, treeList);
		inorder(rootNode.right, treeList);
	}

	public static int countNodes(TreeNode root) {
		List<Integer> treeList = new ArrayList<>();
		inorder(root, treeList);
		return treeList.size();
	}

}
