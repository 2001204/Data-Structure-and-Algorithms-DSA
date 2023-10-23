//Deleting Node By Key

public class DeleteNodeLinkListKey
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
		void Display()
		{
			Node n = head;
			while( n != null )
			{
				System.out.print(  n.data+ " --> "  );
				n = n.next;
			}
		}

	void deleteNode( int key )
	{
		Node temp = head, prev = null;
			if(temp != null && temp.data == key )
		{
			head = temp.next;
			return;
		}
		//last or intermidiate
		while(temp != null && temp.data !=key)
		{
				prev =temp;
				temp = temp.next;
		}
			if(temp == null)
			return;
			prev.next = temp.next;

		}
    	public static void main(String[] args)
 		{
   	 	   	DeleteNodeLinkListKey  L1 = new DeleteNodeLinkListKey();

   			L1.head = new Node(10);
			Node second = new Node(20);
			Node third = new Node(30);
			Node four = new Node(40);

			L1.head.next = second;
			second.next = third;
			third.next = four;

			L1.Display();
			System.out.println("\nLinked List after Deleting given node Key : ");
			System.out.println();

			L1.deleteNode(30);
			L1.Display();

       		 }
}

/*
D:\ADS Workspace\LinkedList>java DeleteNodeLinkList.java
10 --> 20 --> 30 --> 40 -->
Linked List after Deleting given node Key :

10 --> 20 --> 40 -->

*/
