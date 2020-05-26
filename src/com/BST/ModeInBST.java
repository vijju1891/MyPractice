package com.BST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModeInBST {
	 public int[] findMode(Node root) {
	        Map<Integer, Integer> map = new HashMap<>();
	        List<Integer> list = new ArrayList<Integer>();
	        inOrder(root, map);
	        int max = Collections.max(map.values());
	        if(max == 1) {
	        	for(int key : map.keySet()) {
	        	list.add(key);
	        	}
	        }
	        else {
	        	for(int key : map.keySet()) {
	        		if(map.get(key)== max) {
	        			list.add(key);
	        		}
	        	}
	        }
	       
	        
		       	int[] output = list.stream().mapToInt(Integer::intValue).toArray();
		        return output;
	        
	    }
	    public void inOrder(Node root, Map<Integer, Integer> map){
	        if(root == null){
	            return ;
	        }
	        if(map.containsKey(root.value)) {
	        	map.put(root.value, map.get(root.value) + 1);
	        }
	        else {
	        	map.put(root.value, 1);
	        }
	        inOrder(root.left, map);
	        inOrder(root.right, map);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
