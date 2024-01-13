package neetcode_course;

import neetcode_course.Singly_LinkList.Node;

public class TestLinkLists {

	public static void main(String[] args) {
		
		//TestSingleLinkList();
		TestingDoubleLinkList();
	
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
//		s.removeHead();
		//System.out.println("Current Length of LL is - "+s.findCurLength());
//		s.removeEnd();
		//System.out.println("Current Length of LL is - "+s.findCurLength());
//		s.removeNode(s.getNode(4));
		//s.display();
//		System.out.println("Current Length of LL is - "+s.findCurLength());
//		List<Node> ln = s.reverseLinkList(s.head);
//		
//		for(Node n : ln) {
//			System.out.print(n.data + " ");
//		}
		
//		Node n = s.reverse(s.head);
//		
//		while(n != null) {
//			System.out.print(n.data + " ");
//			n = n.next;
//		}
		
		
		Node n1 = s.mergeTwoLists(s.head,s.head);
		
		while(n1 != null) {
			System.out.print(n1.data + " ");
			n1 = n1.next;
		}
	}

	static void TestingDoubleLinkList() {
		Double_LinkList dl = new Double_LinkList();
		System.out.println("at index 1 : "+dl.Get(1)); 
		dl.AddAtHead(5);
		dl.display();
		dl.AddAtHead(3);
		dl.display();
		System.out.println("at index 1  : " + dl.Get(1));
		dl.AddAtTail(6);
		dl.display();
		dl.AddAtIndex(1, 4);
		dl.display();
	}
}
