
//Insertion in DLL in End

class InsertEndDoublyLinkList{

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

		void insert(int new_data)
		{
			Node new_node = new Node(new_data);
			new_node.next = head;
			new_node.prev = null;
			if(head != null)
				head.prev = new_node;
			head = new_node;

		}

			void append(int new_data)
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


		void display(Node n)
		{
			Node p = null;
			System.out.println("Forward direction:");
			while(n != null)
			{
				System.out.print(n.data+"---> ");
				p=n;
				n=n.next;
			}

			System.out.println("Backward direction:");
			while(p != null)
			{
				System.out.print(p.data+"---> ");
				p=p.prev;
			}
System.out.println("\n------------------------------");

		}

		public static void main(String args[])
		{

			InsertEndDoublyLinkList d1 = new InsertEndDoublyLinkList();

			d1.insert(10);
			d1.insert(5);
			d1.insert(23);
			d1.display(d1.head);

			System.out.println("\nAfter appending : ");
			d1.append(33);
			d1.append(28);
			d1.display(d1.head);


		}

}
/*
D:\ADS Workspace\LinkedList>java InsertEndDoublyLinkList.java
Forward direction:
23---> 5---> 10--->
Backward direction:
10---> 5---> 23--->
------------------------------

After appending :
Forward direction:
23---> 5---> 10---> 33---> 28--->
Backward direction:
28---> 33---> 10---> 5---> 23--->
------------------------------
*/