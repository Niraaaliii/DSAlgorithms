package neetcode_course;

public class TestLinkLists {

	public static void main(String[] args) {
		Singly_LinkList s = new Singly_LinkList();
		
		s.addNode(1);
		s.addNode(2);
		s.addNode(3);
		s.addNode(5);

		s.inserAtEnd(6);
//		sList.display();

		s.insertAtHead(0);
//		sList.display();
		
		s.insertAfter(s.getNode(3), 4);
		s.display();
		
		s.removeHead();
		s.display();
		
		s.removeEnd();
		s.display();
		
		s.removeNode(s.getNode(4));
		s.display();
		
		s.insertAfter(s.getNode(3), 4);
		s.display();
	}

}
