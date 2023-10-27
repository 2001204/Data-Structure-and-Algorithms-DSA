ADS6:Linked List

public class LinkedList{
    Node head;
       static class Node {
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
        void Display()
		{
			Node n = head;
			while( n != null )
			{
				System.out.print(  n.data+" -> "  );
				n = n.next;
			}
System.out.print(  "null "  );
		}

        public static void main(String args[]) {

        LinkedList l1=new LinkedList();
        l1.head=new Node(1);
        Node second=new Node(2);
        Node Third =new Node(3);
        Node Fourth=new Node(4);
        l1.head.next=second;
        second.next=Third;
        Third.next=Fourth;
        l1.Display();
       }

}

/*
D:\ADS Workspace\Hackerank>java LinkedList.java
1 -> 2 -> 3 -> 4 -> null
*/