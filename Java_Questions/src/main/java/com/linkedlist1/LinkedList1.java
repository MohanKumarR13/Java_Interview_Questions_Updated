package com.linkedlist1;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

class LinkedList1 {
	Node head;

	// Method to add a new node at the front of the list
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	// Method to get the count of nodes in the linked list
	public int getCount() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static void main(String[] args) {
		LinkedList1 llist = new LinkedList1();
		llist.push(1);
		llist.push(3);
		llist.push(1);
		llist.push(2);
		llist.push(1);
		System.out.println("Count of nodes is " + llist.getCount());
	}
}