package com.reverselinklist;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class ReverseLinkedList {
	public static Node reverseList(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			next = current.next; // Store next node
			current.next = prev; // Reverse current node's pointer
			prev = current; // Move pointers one position ahead
			current = next;
		}
		return prev; // New head of the reversed list
	}

	public static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		System.out.println("Original Linked List:");
		printList(head);

		head = reverseList(head);

		System.out.println("Reversed Linked List:");
		printList(head);
	}
}
