//Reverse linked list , list given by manually here
import java.io.*;
import java.util.*;

public class ReverseSingleLinkedList {
    static Node head;
    int count = 0;       // To keep track of the count of elements

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }


public static int countNodes()
 {
    int count = 0;
    Node current = head;

    while (current != null) {
        count++;
        current = current.next;
    }

    return count;
}

    // Method to reverse the linked list
    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev; // Update the head to the last node (new first node)
    }

    // Method to print the reversed linked list and the count of elements
    void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }

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

    public static void main(String[] args)
 {
ReverseSingleLinkedList l1 = new ReverseSingleLinkedList();
l1.insertEnd(1);
l1.insertEnd(3);
l1.insertEnd(3);
l1.insertEnd(4);
l1.insertEnd(9);
l1.insertEnd(8);
l1.insertEnd(7);
l1.insertEnd(6);

 System.out.print("traversing the list ");

l1.printList();
int nodeCount = countNodes();
System.out.print("total no of nodes : " + nodeCount);


System.out.print(" reversing the list............");
        l1.reverse();
System.out.print("\ntraversing the list ");
       l1.printList();
System.out.print("total no of nodes : " + nodeCount);

    }
}


/*

*/
