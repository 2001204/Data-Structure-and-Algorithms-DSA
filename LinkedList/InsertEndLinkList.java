//Insertion new Node at Ending

public class InsertEndLinkList
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

		
//insertion of new node at end
		void insertEnd(int new_data)
		{
			Node new_node = new Node(new_data);       //new node is created

			if(head == null)                                             //check list is empty ? 
			{
				head = new_node;
				return;
			}
			new_node.next = null;

			Node last = head;                     //creating new reference for traversing last node
			while( last.next != null)
			{
				last = last.next;                  
			}
			last.next = new_node;         //when condition false it assign last node link to new node
			return ;

		}
			

    		public static void main(String[] args)
 		{
   	 	   	InsertEndLinkList  L1 = new InsertEndLinkList();

   			L1.head = new Node(10);
			Node second = new Node(20);
			Node third = new Node(30);
			Node four = new Node(40);
			
			L1.head.next = second;
			second.next = third;
			third.next = four;

			L1.Display();
System.out.println("\nInserting new node at the End");
System.out.println();
			L1.insertEnd(90);
			L1.Display();
System.out.println();
			L1.insertEnd(120);
			L1.Display();
       		 }
}

/*
D:\ADS Workspace\LinkedList>java InsertEndLinkList.java
 --> 10 --> 20 --> 30 --> 40
Inserting new node at the End

 --> 10 --> 20 --> 30 --> 40 --> 90
 --> 10 --> 20 --> 30 --> 40 --> 90 --> 120
*/
