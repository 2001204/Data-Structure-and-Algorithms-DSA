
public class LinkedList1
 {
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node (int d)
		{
			data = d;
			next = null;
		}

	}
    	public static void main(String[] args)
 	{
   	    	LinkedList1  L1 = new LinkedList1();

   		L1.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);

      		 L1.head.next = third;
		third.next = second;

		while (L1.head != null) {
            System.out.println("Node Data: " + L1.head.data);
            L1.head = L1.head.next;
        }
        }
}
/*
D:\ADS Workspace\LinkedList>java LinkedList1.java
Node Data: 10
Node Data: 30
Node Data: 20
*/
