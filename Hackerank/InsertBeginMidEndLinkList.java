//Insertion new Node InsertBeginMidEndLinkList

public class InsertBeginMidEndLinkList
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


//insertion of new node at begining
		void insertBegin(int new_data)
		{
			Node new_Node = new Node(new_data);          //new node is created
			new_Node.next = head;                                     //assign head to new_node next
			head = new_Node;

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
   	 	   	InsertBeginMidEndLinkList  L1 = new InsertBeginMidEndLinkList();

   			L1.head = new Node(10);
			Node second = new Node(20);
			Node third = new Node(30);
			Node four = new Node(40);
			
			L1.head.next = second;
			second.next = third;
			third.next = four;

			L1.display();
			System.out.println("\nInserting new node Begin/Mid/End");
			System.out.println();

			L1.insertBegin(60);
			L1.display();

			L1.insertAfter(L1.head.next, 53);
			System.out.println();
			L1.display();
	System.out.println();
			L1.insertEnd(120);
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
D:\ADS Workspace\Hackerank>java InsertBeginMidEndLinkList.java
 --> 10 --> 20 --> 30 --> 40
Inserting new node Begin/Mid/End

 --> 60 --> 10 --> 20 --> 30 --> 40
 --> 60 --> 10 --> 53 --> 20 --> 30 --> 40
 --> 60 --> 10 --> 53 --> 20 --> 30 --> 40 --> 120
 --> 60 --> 63 --> 10 --> 53 --> 20 --> 30 --> 40 --> 120
 --> 60 --> 63 --> 10 --> 55 --> 53 --> 20 --> 30 --> 40 --> 120

*/
