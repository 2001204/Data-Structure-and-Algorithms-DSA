 //ADS9: Insert a node at a specific position in a linked list

import java.io.*;
import java.util.*;

public class InsertNodeAtPositionLL {

public static void main(String[] args)
   {
        InsertNodeAtPositionLL L1 = new InsertNodeAtPositionLL();

        L1.head = new Node(16);
        Node second = new Node(13);
        Node third = new Node(7);

        L1.head.next = second;
        second.next = third;

        System.out.print("Linked list before insertion: ");
        L1.Display();

        L1.InsertAtPos(2, 1);  //Insert 1 at position 2
        System.out.print("Linked list after insertion: ");
        L1.Display();
    }

    Node head;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    
    void InsertAtPos(int position, int data)
	 {
        	Node new_node = new Node(data);
        
       		 if (position < 1) {
            		System.out.println("Invalid position");
            		return; 
        	}

      		if (position == 1) {
            	         new_node.next = head;
           		 head = new_node;
        	}
		 else {
           			 Node previous = head;
            			for (int i = 0; i < position - 1; i++) {
            				if (previous == null) {
                    			System.out.println("Position is out of bounds.");
                    			return;
                			}
                		previous = previous.next;
           			}
            			if (previous == null) {
               			System.out.println("Position is out of bounds.");
               		 	return;
          	  	}
            
            		new_node.next = previous.next;
            		previous.next = new_node;
       		 }
    }

      void Display()
    {
        Node current = head;
        while (current != null) {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println("null");
    }
}


/*
D:\ADS Workspace\Hackerank>java InsertNodeAtPositionLL.java
Linked list before insertion: 16 13 7 null
Linked list after insertion: 16 13 1 7 null

 
*/

           