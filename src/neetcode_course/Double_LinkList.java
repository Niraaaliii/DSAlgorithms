package neetcode_course;

public class Double_LinkList {

	class Node {
		int val;
		Node prev;
		Node next;

		public Node() {
			this.val = -1;
			prev = null;
			next = null;
		}

		public Node(int val) {
			this.val = val;
			prev = null;
			next = null;
		}

	}

	public Node head;
	public Node tail;

	public Double_LinkList() {
		head = null;
		tail = null;
	}

	public int Get(int index) {

		Node cur = head;
		for(int i = 0; cur!= null ;i++) {
			if(i == index) {
				return cur.val;
			}
			cur = cur.next;
		}
		return -1;
	}

	public void AddAtHead(int val) {
		
		Node n = new Node(val);
		if(head == null ) {
			head = n;
			tail = n;
		}
		else {
			n.next = head;
			head = n;
		}
	}

	public void AddAtTail(int val) {

		Node n = new Node(val);
		if(tail == null) {
			return;
		}
		else {
			tail.next = n;
			tail = n;
		}
	}

	public void AddAtIndex(int index, int val) {
		Node cur = head;
		Node n = new Node(val);
		for(int i = 0; cur!= null ;i++) {
			if(i == index) {
				n.prev = cur;
				n.next = cur.next;
				cur.next.prev = n;
			}
			cur = cur.next;
		}
	}

	public void DeleteAtIndex(int index) {

	}
	
	public void display() {
		Node current = head;

		if (head == null) {
			System.out.println("Double linked list is empty");
			return;
		}
		System.out.println("Nodes of double linked list: ");
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}


}
