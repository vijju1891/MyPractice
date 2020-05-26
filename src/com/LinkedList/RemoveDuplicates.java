package com.LinkedList;

public class RemoveDuplicates {
	static Node head;
	public Node removeDuplicatesFromList(Node head) {
		Node node = head;
		while(node.next != null) {
			if(node.data == node.next.data) {
				node.next = node.next.next;
				continue;
			}
			node = node.next;
		}
		return head;
	}
	
	public void display(Node head) {
		Node node = head;
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicates rDuplicates = new RemoveDuplicates();
		RemoveDuplicates.head = new Node(5);
		RemoveDuplicates.head.next = new Node(5);
		RemoveDuplicates.head.next.next = new Node(5);
		RemoveDuplicates.head.next.next.next = new Node(6);
		RemoveDuplicates.head.next.next.next.next = new Node(9);
		RemoveDuplicates.head.next.next.next.next.next = new Node(9);
		RemoveDuplicates reDuplicates = new RemoveDuplicates();
		reDuplicates.removeDuplicatesFromList(head);
		reDuplicates.display(head);
		
	}

}
