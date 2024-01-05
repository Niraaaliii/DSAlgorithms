package neetcode_course;

import java.util.*;

public class Singly_LinkList {

	// Represent a node of the singly linked list
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// Represent the head and tail of the singly linked list
	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {
		// Create a new node
		Node newNode = new Node(data);

		// Checks if the list is empty
		if (head == null) {
			// If list is empty, both head and tail will point to new node
			head = newNode;
			tail = newNode;
		} else {
			// newNode will be added after tail such that tail's next will point to newNode
			tail.next = newNode;
			// newNode will become new tail of the list
			tail = newNode;
		}
	}

	public void inserAtEnd(int data) {

		if (tail != null) {
			Node newNode = new Node(data);
			tail.next = newNode;
			tail = newNode;
		} else {
			System.out.println("List is empty");
			return;
		}
	}

	public void insertAtHead(int data) {

		if (head != null) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		} else {
			System.out.println("List is empty");
			return;
		}
	}

	public void insertAfter(Node prev_node, int data) {

		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}

		Node new_node = new Node(data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;

	}

	public void removeHead() {
		head = head.next;
	}

	public void removeEnd() {
		Node cur = head;

		while (cur.next.next != null) {
			cur = cur.next;
		}

		cur.next = null;
		tail = cur;
	}

	public void removeNode(Node n) {
		Node cur = head;

		while (cur.next != n) {
			cur = cur.next;
		}

		cur.next = n.next;

	}

	public Node getNode(int val) {
		Node current = head;
		while (current != null) {
			if (current.data == val) {
				return current;
			}
			current = current.next;
		}

		return null;
	}

	public void display() {
		Node current = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public int findCurLength() {
		Node current = head;
		int i = 0;

		if (head == null) {
			System.out.println("List is empty");
			return i;
		}
		while (current != null) {
			i++;
			current = current.next;
		}

		return i;
	}

//	public List<Node> reverseLinkList(Node head) {
//
//		Stack<Node> rev = new Stack<Node>();
//		List<Node> revList = new ArrayList<Node>();
//
//		Node cur = head;
//
//		while (cur != null) {
//			rev.push(cur);
//			cur = cur.next;
//		}
//
//		while (!rev.empty()) {
//			revList.add(rev.pop());
//		}
//
//		return revList;
//	}

	public Node reverse(Node head) {

		/* Recursive Method T/S - O(n) */
		// base case
//		if (head == null || head.next == null)
//			return head;
//
//		Node newHead = reverse(head.next);
//
//		head.next.next = head;
//		head.next = null;
//
//		return newHead;
		
		
		/* Iterative Method T-O(n) S-O(1) */
		Node prev = null;
		Node curr = head;
		Node next;
		
		while(curr!=null) {
			//assigning curr's next to next pointer
			next = curr.next;
			//Re-directing curr's next to previous pointer
			curr.next = prev;
			//now current node is previous node
			prev = curr;
			//and current node is next node
			curr = next;
		}
		
		//at last assigning head to last node
		head = prev;
		
		return head;

	}

}
