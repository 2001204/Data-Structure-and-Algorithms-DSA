// Delete a Node 3

public class DeleteAtPositon3
 {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /*void deleteNode(int data)           //by using data 
   { 
        Node current = head;
        Node prev = null;

        while (current != null && current.data != data)
	 {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            // Node with the specified key was not found
            return;
        }

        if (prev != null) {
            // Update the previous node's next reference to skip the current node
            prev.next = current.next;
        } else {
            // If the key is in the head node, update the head
            head = current.next;
        }
    }*/
	void deleteNode(int key)                          //by using key or key 
	{
		if (head == null)
		return;
		Node temp = head, last = null;
				
		/*if(key == 0)                                //Deletion at begining
		{
			head = temp.next;
		}*/
				
	  	 for (int i = 0 ; temp != null && i<key-1; i++)   //Deletion at the intermidiate key
		{
			temp = temp.next;
		}
		/*if(temp == null || temp.next == null)     //Deletion at the end
		{
			return;
		}

		last = temp.next.next;
		temp.next = last;*/
	}

    void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args)    
{
        DeleteAtPositon3 list = new DeleteAtPositon3();
        list.head = new Node(20);
        list.head.next = new Node(6);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(19);
	list.head.next.next.next.next  = new Node(7);
	list.head.next.next.next.next.next = new Node(4);
	list.head.next.next.next.next.next.next  = new Node(15);
	list.head.next.next.next.next.next.next.next= new Node(9);

        System.out.println("Original list:");
        list.display();

        list.deleteNode(3);

        System.out.println("\nList after deleting node with value :");
        list.display();
    }
}


/*
D:\ADS Workspace\Hackerank>java DeleteAtPositon.java
Original list:
20 6 2 19 7 4 15 9
List after deleting node with value :
20 6 2 7 4 15 9
*/