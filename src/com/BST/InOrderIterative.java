package com.BST;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderIterative {
	
	public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        TreeNode current = root;
        while(current != null) {
        	while(current != null) {
            	stack.push(current);
            	current = current.left;
            }
             current = stack.pop();
            System.out.println(current);
            list.add(current.val);
            current = current.right;
        }
        while(stack.size() > 0) {
        	list.add(stack.pop().val);
        }
        
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode(1);
		node.right = new TreeNode(2);
		node.right.left = new TreeNode(3);
		InOrderIterative iterative = new InOrderIterative();
		System.out.println(iterative.inorderTraversal(node));
	}

}
