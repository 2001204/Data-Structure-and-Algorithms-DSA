//Insertion in DLL at Begin

class InsertBeginDoublyLinkList{

	Node head;
	static class Node
	{
		int data;
		Node next, prev;

		Node(int d)
		{
			data = d;
			next = null;
			prev = null;
		}
	}

	void insert(int new_data)
	{
    		Node new_node = new Node(new_data); // Create a new node
    		new_node.next = head;
    		new_node.prev = null;
   		 if (head != null)
      			  head.prev = new_node; // Update the previous node of the current head
   		 head = new_node;
	}

	void display(Node n)
	{
		Node p = null;                       //ref pointer for print backward direction
		System.out.print("Forward Direction : ");
		while(n != null)
		{
			System.out.print(n.data+ " --> ");
			p = n;
			n = n.next;
		}

		System.out.print("\nBackward Direction : ");
		while(p != null)
		{
			System.out.print(p.data+ " --> ");
			p =p.prev;
		}
		System.out.println("\n--------------------------------------------");
	}


public static void main(String[] args)
	{
		InsertBeginDoublyLinkList d1 = new InsertBeginDoublyLinkList();

		d1.insert(5);
		d1.display(d1.head);

		d1.insert(15);
		d1.display(d1.head);

		d1.insert(25);
		d1.display(d1.head);

		d1.insert(30);
		d1.insert(40);
		d1.insert(50);
		d1.display(d1.head);

	}

}


/*
D:\ADS Workspace\LinkedList>java DoublyLinkedList.java
Forward Direction : 5 -->
Backward Direction : 5 -->
--------------------------------------------
Forward Direction : 15 --> 5 -->
Backward Direction : 5 --> 15 -->
--------------------------------------------
Forward Direction : 25 --> 15 --> 5 -->
Backward Direction : 5 --> 15 --> 25 -->
--------------------------------------------
Forward Direction : 50 --> 40 --> 30 --> 25 --> 15 --> 5 -->
Backward Direction : 5 --> 15 --> 25 --> 30 --> 40 --> 50 -->
--------------------------------------------
*/











