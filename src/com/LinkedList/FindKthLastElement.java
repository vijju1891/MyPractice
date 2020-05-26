package com.LinkedList;

public class FindKthLastElement {
	static Node head;
	
	public int lengthOfList(Node head) {
		Node node = head;
		int count= 0;
		while(node != null) {
			count++;
			node = node.next;
		}
		return count;
	}
	public void findKthElementFrommLast(Node head,int k) {
		if(k > lengthOfList(head)) {
			System.out.println("enter valid k value");
			return;
		}			
		int fromBeginning = lengthOfList(head) - k + 1;
		Node node = head;
		int count = 0;
		while(node != null) {
			count++;
			if(count == fromBeginning) {
				System.out.println(node.data);
			}
			node = node.next;
		}
	}
	
	public Node deleteMiddleElement(Node head) {
		if(lengthOfList(head) <3) {
			System.out.println("cannot del first n last elements");
			return null;
		}
		Node node = head;
		int count = 0;
		int middle = (int) (lengthOfList(head) / 2.0) ;
		while(node != null) {
			count++;
			if(middle == count) {
				node.next = node.next.next;
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
		FindKthLastElement fKthLastElement = new FindKthLastElement();
		FindKthLastElement.head = new Node(3);
		FindKthLastElement.head.next = new Node(4);
		FindKthLastElement.head.next.next = new Node(6);
		FindKthLastElement.head.next.next.next = new Node(3);
		FindKthLastElement.head.next.next.next.next = new Node(2);
		
			
		fKthLastElement.findKthElementFrommLast(head, 6);
		Node node = fKthLastElement.deleteMiddleElement(head);
		fKthLastElement.display(node);
		
	}

}
