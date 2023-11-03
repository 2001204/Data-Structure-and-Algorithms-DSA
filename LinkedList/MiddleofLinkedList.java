//How to find the middle element of a linked list in Java


public class MiddleofLinkedList 
{
    public static void main(String[] args) 
	{
       	 	LinkedList list = new LinkedList();
        	list.append(1);
        	list.append(2);
        	list.append(3);
        	list.append(4);
       	 	list.append(5);

       	 	System.out.print("Original List: ");
        	list.display();

        	Node middle = list.findMiddle();
        	if (middle != null) {
            		System.out.println("Middle element: " + middle.data);
        	} else 
		{
            		System.out.println("List is empty.");
        	}
    	}
}


class Node 
{
    int data;
    Node next;

    public Node(int data) 
	{
        	this.data = data;
       	 	this.next = null;
    	}
}

class LinkedList 
{
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int data) .
	{
        	Node newNode = new Node(data);
        	if (head == null)
		{
            		head = newNode;
        	} else {
            		Node current = head;
            		while (current.next != null) {
                		current = current.next;
            			}
            	current.next = newNode;
       	 	}
    }

    public Node findMiddle() 
	{
        	if (head == null) {
            		return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null)
	 {
            	slow = slow.next;
            	fast = fast.next.next;
        }

        return slow;
    }

    public void display() 
	{
        	Node current = head;
        	while (current != null) {
            		System.out.print(current.data + " ");
            		current = current.next;
        }
        System.out.println();
    }
}

/*
D:\ADS Workspace\LinkedList>java MiddleofLinkedList.java
Original List: 1 2 3 4 5
Middle element: 3
*/

