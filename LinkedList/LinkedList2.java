public class LinkedList2
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

    		public static void main(String[] args)
 		{
   	 	   	LinkedList2  L1 = new LinkedList2();

   			L1.head = new Node(10);
			Node second = new Node(20);
			Node third = new Node(30);
			Node four = new Node(40);
			
			L1.head.next = second;
			second.next = third;
			third.next = four;

			L1.Display();
       		 }
}
