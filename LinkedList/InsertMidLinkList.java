//Insertion new Node at Mid position

public class InsertMidLinkList
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
		void display()
		{
			Node n = head;
			while( n != null )
			{
				System.out.print(" --> " + n.data  );
				n = n.next;
			}
		}
		
//insertion of new node in mid position 
		void insertAfter(Node prev_node,  int new_data)       //prev_Node is reference pointer  whoes value provided in function call
		{
			if(prev_node == null)                                  //check list is empty ?
			{
				System.out.println("Empty list !!!");
				return;
			}
			
			Node new_node = new Node(new_data);       //create new node
			new_node.next = prev_node.next;                 //if list is not empty
			prev_node.next = new_node;
		}

    		public static void main(String[] args)
 		{
   	 	   	InsertMidLinkList  L1 = new InsertMidLinkList();

   			L1.head = new Node(10);
			Node second = new Node(20);
			Node third = new Node(30);
			Node four = new Node(40);
			
			L1.head.next = second;
			second.next = third;
			third.next = four;

			L1.display();
			System.out.println("\nInserting new node at the Mid after given node ");
			System.out.println();

			L1.insertAfter(L1.head.next, 53);
			System.out.println();
			L1.display();
		
			L1.insertAfter(L1.head, 63);
			System.out.println();
			L1.display();

			L1.insertAfter(L1.head.next.next, 55);
			System.out.println();
			L1.display();
		
       		 }
}

/*
D:\ADS Workspace\LinkedList>java InsertMidLinkList.java
 --> 10 --> 20 --> 30 --> 40
Inserting new node at the Mid after given node

 --> 10 --> 20 --> 53 --> 30 --> 40
 --> 10 --> 63 --> 20 --> 53 --> 30 --> 40
 --> 10 --> 63 --> 20 --> 55 --> 53 --> 30 --> 40
*/
