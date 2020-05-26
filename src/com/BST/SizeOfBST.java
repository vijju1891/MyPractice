package com.BST;

public class SizeOfBST {
	public int size(Node root) {
		if(root == null) {
			return 0;
		}
		
		return 1 + size(root.left) + size(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
