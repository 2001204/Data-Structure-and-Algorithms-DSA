   //Insertion in DLL in Between

class InsertAfterDoublyLinkList{

	Node head;

	static class Node{
		int data;
		Node next,prev;

		Node(int d)
		{
			data = d;
			next = null;
			prev = null;
		}
	}

	void insert(int new_data)      //insert at begin
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head != null)
			head.prev = new_node;
		head = new_node;

	}

	void append(int new_data)         //insert at end
	{
		Node new_node = new Node(new_data);
		Node last = head;
		new_node.next = null;//last node in the list
		if( head == null)
		{
			new_node.prev=null;//prerequisit for first node
			head = new_node;
			return;
		}
		while(last.next != null)
		{
			last=last.next;
		}
		last.next = new_node;
		new_node.prev = last;
	}

	void insertAfter(Node prev_node, int new_data)    //insert at given position
	{
		if(prev_node == null)
		{
			System.out.println("Node cannot be exist.");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		new_node.prev = prev_node;
		if( new_node.next != null)
			new_node.next.prev = new_node;

	}
	void display(Node n)
	{
		Node p = null;
		System.out.print("Forward direction:");
		while(n != null)
		{
			System.out.print(n.data+"---> ");
			p=n;
			n=n.next;
		}

		System.out.print("\nBackward direction:");
		while(p != null)
		{
			System.out.print(p.data+"---> ");
			p=p.prev;
		}
System.out.println("\n----------------------------");

	}

	public static void main(String args[])
	{

		InsertAfterDoublyLinkList d1 = new InsertAfterDoublyLinkList();



		d1.head = new Node(10);
		d1.display(d1.head);

		d1.insert(5);
		d1.insert(23);
		d1.append(33);
		d1.append(28);
		d1.display(d1.head);

		System.out.println("\nAfter Insert nod at particular position : ");
		d1.insertAfter(d1.head.next, 45);
		d1.display(d1.head);

		d1.insertAfter(d1.head.next.next, 55);
		d1.display(d1.head);

	}

}

/*
D:\ADS Workspace\LinkedList>java InsertAfterDoublyLinkList.java
Forward direction:10--->
Backward direction:10--->
----------------------------
Forward direction:23---> 5---> 10---> 33---> 28--->
Backward direction:28---> 33---> 10---> 5---> 23--->
----------------------------

After Insert nod at particular position :
Forward direction:23---> 5---> 45---> 10---> 33---> 28--->
Backward direction:28---> 33---> 10---> 45---> 5---> 23--->
----------------------------
Forward direction:23---> 5---> 45---> 55---> 10---> 33---> 28--->
Backward direction:28---> 33---> 10---> 55---> 45---> 5---> 23--->
----------------------------
*/