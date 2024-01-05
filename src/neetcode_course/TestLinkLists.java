package neetcode_course;

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
	}

	static void TestingDoubleLinkList() {
		
	}
}
