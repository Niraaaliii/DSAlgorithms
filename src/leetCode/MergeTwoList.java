package leetCode;

import java.util.Scanner;

public class MergeTwoList {

	public static void main(String[] args) {
		// Example usage
		MergeTwoList merger = new MergeTwoList();

		Scanner sc = new Scanner(System.in);

		// List1
		System.out.println("Size of 1st List");
		int size = sc.nextInt();
		System.out.println("Enter elements");
		int[] numbers1 = new int[size]; 
	    for (int i = 0; i < size; i++) { 
	        numbers1[i] = sc.nextInt();
	    }

		// List1
		System.out.println("Size of 2st List");
		int size1 = sc.nextInt();
		System.out.println("Enter elements");
		int[] numbers2 = new int[size1];
		for (int i = 0; i < size1; i++) {
			numbers2[i] = sc.nextInt();
		}

		// Create example linked lists
		ListNode list1 = merger.createLinkedList(numbers1);
		ListNode list2 = merger.createLinkedList(numbers2);

		// Merge the lists
		ListNode mergedList = merger.mergeTwoLists(list1, list2);

		// Print the merged list
		merger.printLinkedList(mergedList);
	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		// Create a dummy node to serve as the head of the merged list
		ListNode dummyHead = new ListNode(-1);
		ListNode current = dummyHead;

		// Compare the values of the nodes in both lists and merge them
		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				current.next = list1;
				list1 = list1.next;
			} else {
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}

		// Append the remaining nodes from the non-empty list
		if (list1 != null) {
			current.next = list1;
		} else {
			current.next = list2;
		}

		// Return the head of the merged list (excluding the dummy node)
		return dummyHead.next;
	}

	// Helper method to create a linked list from an array of values
	public ListNode createLinkedList(int[] values) {
		if (values == null || values.length == 0) {
			return null;
		}

		ListNode head = new ListNode(values[0]);
		ListNode current = head;

		for (int i = 1; i < values.length; i++) {
			ListNode newNode = new ListNode(values[i]);
			current.next = newNode;
			current = newNode;
		}

		return head;
	}

	// Helper method to print the values of a linked list
	public void printLinkedList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
