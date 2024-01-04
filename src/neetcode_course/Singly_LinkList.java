package neetcode_course;

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

	// addNode() will add a new node to the list
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
		
		while(cur.next.next != null) {
			cur = cur.next;
		}
		
		cur.next = null;
		tail = cur;
	}
	
	public void removeNode(Node n) {
		Node cur = head;
		
		while(cur.next != n) {
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
}
