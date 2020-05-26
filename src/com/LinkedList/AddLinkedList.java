package com.LinkedList;
import  com.LinkedList.Node;


public class AddLinkedList {
	static Node head1 = null;
	static Node head2 = null;
	static Node head3= null;
	
	public String convertListtoString(Node head) {
		StringBuffer s = new StringBuffer();
		Node node = head;
		while(node != null) {
			s.append(node.data);
			node = node.next;
		}
		return s.reverse().toString();
	}
	public void addNode(int number) {
		if(head3 == null)
			head3  = new Node(number);
		else {
			Node node = head3;
			while(node != null) {
				if(node.next == null) {
					node.next = new Node(number);
					break;
				}
				node = node.next;
			}
		}
		
	}
	
	public void numberToList(int number) {
		
		while(number > 0) {
			int reminder = number%10;
			addNode(reminder);			
			number = number/10;
			
		}
	}
	
	public void displayList(Node head) {
		Node node = head;
		while(node != null) {
			System.out.print(node.data+"-->");
			node = node.next;
		}
	}
	
	public void addLists(Node head1, Node head2) {
		int number1 = Integer.valueOf(convertListtoString(head1));
		int number2 = Integer.valueOf(convertListtoString(head2));
		System.out.println(number1 + "   " + number2);
		int sum = number1 + number2;
		System.out.println(sum);
		numberToList(sum);
	}
	
	public void reverseLinkedList(Node head1) {
		Node previous = null;
		Node current = head1;
		Node temp = null;
		while(current != null) {
			temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
		}
		displayList(previous);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddLinkedList list1 = new AddLinkedList();
		AddLinkedList.head1 = new Node(7);
	//	AddLinkedList.head1.next= new Node(5);
	//	AddLinkedList.head1.next.next = new Node(9);
		
		
		AddLinkedList.head2 = new Node(2);
		AddLinkedList.head2.next = new Node(5);
		AddLinkedList.head2.next.next = new Node(7);
		System.out.println(AddLinkedList.head1.data);
		//list1.addLists(head1, head2);
		
		//list1.displayList(head3);
		
		list1.reverseLinkedList(head1);
	}

}
