package com.linkedlist;

import java.util.HashSet;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

public class LinkedList {
	Node head;

	void removeDuplicates() {
		HashSet<Integer> seen = new HashSet<>();
		Node current = head;
		Node prev = null;
		while (current != null) {
			if (seen.contains(current.data)) {
				prev.next = current.next;
			} else {
				seen.add(current.data);
				prev = current;
			}
			current = current.next;
		}
	}

	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.push(21);
		list.push(43);
		list.push(41);
		list.push(21);
		list.push(12);
		list.push(11);
		list.push(12);

		System.out.println("Linked List before removing duplicates:");
		list.printList();

		list.removeDuplicates();

		System.out.println("Linked List after removing duplicates:");
		list.printList();
	}
}