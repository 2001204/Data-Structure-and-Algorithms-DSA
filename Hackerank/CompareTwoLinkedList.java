//Compare two Linked List

public class CompareTwoLinkedList
{
static Node head1,head2;
	public static void main(String args[])
	{
		CompareTwoLinkedList List1 = new CompareTwoLinkedList();
	
		CompareTwoLinkedList List2 = new CompareTwoLinkedList();

		List1.head1 = new Node(20);
      	  	List1.head1.next = new Node(6);
      	  	List1.head1.next.next = new Node(2);
        	List1.head1.next.next.next = new Node(19);
		List1.head1.next.next.next.next  = new Node(7);
	
		List2.head2 = new Node(20);
        	List2.head2.next = new Node(6);
        	List2.head2.next.next = new Node(25);
        	List2.head2.next.next.next = new Node(19);
		//List2.head2.next.next.next.next  = new Node(7);

		System.out.println("List1: ");
      		 display(List1.head1);
		System.out.println("-------------------------------------------------------------------------");
        	System.out.println("List2: ");
        	display(List2.head2);
		System.out.println("=======================================");
		boolean result = compare(List1.head1, List2.head2) ;
		System.out.println("Is List1 and List2 are Equal : "+ result);

	}
	public static boolean compare( Node List1, Node List2)
	{
		while(( head1 != null && head2 !=null ) &&(head1.data == head2.data) ){
		
			head1 = head1.next;
			head2 = head2.next;
		}
		return (head1 == null && head2 ==null);
	}
public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

/*
D:\ADS Workspace\Hackerank>java CompareTwoLinkedList.java
List1:
20 -> 6 -> 2 -> 19 -> 7 -> null
-------------------------------------------------------------------------
List2:
20 -> 6 -> 2 -> 19 -> 7 -> null
=======================================
Is List1 and List2 are Equal : true
//------------------------------------------------------------------------------------------------------------------------------
D:\ADS Workspace\Hackerank>java CompareTwoLinkedList.java
List1:
20 -> 6 -> 2 -> 19 -> 7 -> null
-------------------------------------------------------------------------
List2:
20 -> 6 -> 25 -> 19 -> null
=======================================
Is List1 and List2 are Equal : false
*/