//ADS Inserting a Node Into a Sorted Doubly Linked List

class DoublyInsertionSortedLinkedList
{
	static class Node {
    		public int data;
    		public Node next;
    		public Node prev;

    		public Node(int data) {
     	   		this.data = data;
        		this.next = null;
        		this.prev = null;
    		}
	}
	public static Node sortedInsert(Node head, int data)
 	{
  	  	Node newNode = new Node(data);

    		if (head == null) {
       		 // If the list is empty, the new node becomes the head.
        	return newNode;
    	}

    	if (data < head.data) {
       	 	// If the new data is smaller than the head, insert the new node before the head.
        	newNode.next = head;
        	head.prev = newNode;
        	return newNode;
    	}
	Node current = head;

    	while (current.next != null && data > current.next.data) {
        	current = current.next;
    	}

   	 // Insert the new node after the 'current' node.
    		newNode.prev = current;
    		newNode.next = current.next;

    	if (current.next != null) {
        	current.next.prev = newNode;
    	}
    	current.next = newNode;
    	return head;
}

	public static void display(Node node)
	{
    		while (node != null)
    		{
        		System.out.print(node.data + " ");
        		node = node.next;
    		}
	}

	public static void main(String[] args)
	{

    		Node head = null; // Initialize an empty list

   	 	int[] dataValues = {1, 3, 4, 10};
    		for (int data : dataValues) {
      			  head = sortedInsert(head, data);
    		}
System.out.println("Before Inserted into Sorted  Linked List : ");
display(head);
System.out.println("\n---------------------------------------------");
    		int newData = 5;
   	 	head = sortedInsert(head, newData);
System.out.println("After Inserting , Sorting Linked List : ");
    		display(head);

	}
}

/*
D:\ADS Workspace\Hackerank>java DoublySortedLinkedList.java
Before Inserted into Sorted  Linked List :
1 3 4 10
---------------------------------------------
After Inserting , Sorting Linked List :
1 3 4 5 10
*/



