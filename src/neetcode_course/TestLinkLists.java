package neetcode_course;

import java.util.List;

import neetcode_course.Singly_LinkList.Node;

public class TestLinkLists {

	public static void main(String[] args) {
		
		TestSingleLinkList();
		//TestingDoubleLinkList();
	
	}
	
	static void TestSingleLinkList() {
		
		Singly_LinkList s = new Singly_LinkList();
		s.addNode(1);
		s.addNode(2);
		s.addNode(3);
		s.addNode(5);
		//System.out.println("Current Length of LL is - "+s.findCurLength());
		s.inserAtEnd(6);
		//System.out.println("Current Length of LL is - "+s.findCurLength());
		s.insertAtHead(0);
		//System.out.println("Current Length of LL is - "+s.findCurLength());
		s.insertAfter(s.getNode(3), 4);
		//System.out.println("Current Length of LL is - "+s.findCurLength());
		s.removeHead();
		//System.out.println("Current Length of LL is - "+s.findCurLength());
		s.removeEnd();
		//System.out.println("Current Length of LL is - "+s.findCurLength());
		s.removeNode(s.getNode(4));
		s.display();
//		System.out.println("Current Length of LL is - "+s.findCurLength());
//		List<Node> ln = s.reverseLinkList(s.head);
//		
//		for(Node n : ln) {
//			System.out.print(n.data + " ");
//		}
		
		Node n = s.reverse(s.head);
		
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	static void TestingDoubleLinkList() {
		
	}
}
