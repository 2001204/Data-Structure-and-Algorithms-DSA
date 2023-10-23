
public class SinglyLinkedList
 {
    public static void main(String[] args)
 {
        
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        node1.next = node2;
        node2.next = node3;

        Node current = node1;

        while (current != null)
 	{
            System.out.println("Node Data: " + current.data);
            current = current.next;
        }
    }
}

class Node
{
	int data;
	Node next;
	Node (int d)
	{
		data = d;
		next = null;
		
	}

}
/*
D:\ADS Workspace\LinkedList>java SinglyLinkedList.java
Node Data: 10
Node Data: 20
Node Data: 30
*/
