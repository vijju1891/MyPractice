package com.BST;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import com.BST.*;

public class PreOrderIterative {
	 public List<Integer> preorderTraversal(TreeNode root) {
	        Stack<TreeNode> stack = new Stack<TreeNode>();
	        List<Integer> list = new ArrayList<Integer>();
	        //TreeNode current = root;
	        stack.push(root);
	        while(stack.size() > 0) {
	        	 TreeNode current = stack.peek();
	        	list.add(current.val);
	        	stack.pop();
	        	System.out.println(list);
	        	if(current.right != null) {
	        		stack.push(current.right);
	        	}
	        	if(current.left != null) {
	        		stack.push(current.left);
	        	}
	        }
	        
	      return list;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode(3);
		node.right = new TreeNode(2);
		node.left = new TreeNode(1);
		PreOrderIterative iterative = new PreOrderIterative();
		System.out.println(iterative.preorderTraversal(node));
	}

}
