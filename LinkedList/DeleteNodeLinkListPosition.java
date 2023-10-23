//Deleting Node By Position

public class DeleteNodeLinkListPosition
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

	void deleteNode(int position)
	{
		if (head == null)
		return;
		Node temp = head, last = null;
				//Deletion at begining
		if(position == 0)
		{
			head = temp.next;
		}
				//Deletion at the intermidiate position
	  	 for (int i = 0 ; temp != null && i<position-1; i++)
		{
			temp = temp.next;
		}
		if(temp == null || temp.next == null)
		{
			return;
		}

		last = temp.next.next;
		temp.next = last;
	}
    	public static void main(String[] args)
 		{
   	 	   	DeleteNodeLinkListPosition  L1 = new DeleteNodeLinkListPosition();

   			L1.head = new Node(18);
			Node second = new Node(12);
			Node third = new Node(13);
			Node four = new Node(11);
			Node five = new Node(17);


			L1.head.next = second;
			second.next = third;
			third.next = four;
			four.next = five;

			L1.Display();
			System.out.println("\nLinked List after Deleting given node Key : ");
			System.out.println();

			L1.deleteNode(1);
			L1.Display();

       		 }
}

/*
18 --> 12 --> 13 --> 11 --> 17

Linked List after Deleting given node Key :

18 --> 13 --> 11 --> 17
*/
