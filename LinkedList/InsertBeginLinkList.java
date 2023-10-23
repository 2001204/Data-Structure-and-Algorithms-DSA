//Insertion new Node at begining

public class InsertBeginLinkList
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
				System.out.print(" --> " + n.data  );
				n = n.next;
			}
		}

//insertion of new node at begining
		void insertBegin(int new_data)
		{
			Node new_Node = new Node(new_data);          //new node is created
			new_Node.next = head;                                     //assign head to new_node next
			head = new_Node;

		}


    		public static void main(String[] args)
 		{
   	 	   	InsertBeginLinkList  L1 = new InsertBeginLinkList();

   			L1.head = new Node(10);
			Node second = new Node(20);
			Node third = new Node(30);
			Node four = new Node(40);

			L1.head.next = second;
			second.next = third;
			third.next = four;

			L1.Display();
			System.out.println("\nInsertion at begining");

			System.out.println();
			L1.insertBegin(60);
			L1.Display();

			System.out.println();
			L1.insertBegin(50);
			L1.Display();

			System.out.println();
			L1.insertBegin(60);
			L1.Display();
       		 }
}

/*
D:\ADS Workspace\LinkedList>java InsertBeginLinkList.java
 --> 10 --> 20 --> 30 --> 40
Insertion at begining

 --> 60 --> 10 --> 20 --> 30 --> 40
 --> 50 --> 60 --> 10 --> 20 --> 30 --> 40
 --> 60 --> 50 --> 60 --> 10 --> 20 --> 30 --> 40*/
