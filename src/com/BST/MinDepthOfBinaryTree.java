package com.BST;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
    	 if(root == null){
             return 0;
         }
         if(root.right == null && root.left == null){
             return 1;
         }
         int minDepth = 0;
        if(root.right == null){
           return 1 + minDepth(root.left);
        }
         else if(root.left == null){
             return 1 + minDepth(root.right);
         }
         else{
         int left = 1 + minDepth(root.left);
         int right = 1 + minDepth(root.right);
        // System.out.println(left + " " + right);
         return  Math.min(left, right);
         }
             
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode(10);
		node.left = new TreeNode(8);
		node.right = new TreeNode(9);
		node.left.left= new TreeNode(6);
		node.left.right = new TreeNode(7);
		MinDepthOfBinaryTree mTree = new MinDepthOfBinaryTree();
		System.out.println(mTree.minDepth(node));
	}

}
