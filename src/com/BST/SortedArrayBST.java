package com.BST;

public class SortedArrayBST {
	static Node root;
	public Node constructBst(int[] input, int left, int right) {
		if(left > right) {
			return null;
		}
			int mid = (left + right) / 2;	
			Node node  = new Node(mid);
			node.left = constructBst(input, left, mid-1);
			node.right = constructBst(input, mid +1 , right);		
			return node;	
	}

	public void displayBst(Node root) {
		if(root == null)
			return ;
		System.out.println(root.value);
		displayBst(root.left);
		displayBst(root.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2, 3 , 4, 5, 6, 7, 8, 9, 10};
		SortedArrayBST sArrayBST = new SortedArrayBST();
		root = sArrayBST.constructBst(input, 0, input.length-1);
		sArrayBST.displayBst(root);
		
	}

}
