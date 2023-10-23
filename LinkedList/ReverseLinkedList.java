// Java program for reversing the linked list

class ReverseLinkedList {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}


	Node reverse(Node node)
	{
		Node prev = null;
		Node temp = node;
		Node next = null;
		while (temp != null) {
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		node = prev;
		return node;
	}

	// prints content of double linked list
	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}


	public static void main(String[] args)
	{
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}
}
/*

D:\ADS Workspace\LinkedList>java ReverseLinkedList.java
Given linked list
85 15 4 20
Reversed linked list
20 4 15 85
*/