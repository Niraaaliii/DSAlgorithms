package neetcode_course;

public class TestLinkLists {

	public static void main(String[] args) {
		Singly_LinkList sList = new Singly_LinkList();

		// Add nodes to the list
		sList.addNode(1);
		sList.addNode(2);
		sList.addNode(3);
		sList.addNode(4);

		// Displays the nodes present in the list
//		sList.display();

		sList.inserAtEnd(5);

//		sList.display();

		sList.insertAtHead(0);

		sList.display();
	}

}
