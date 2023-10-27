//reverse linked list , list given by user input

import java.io.*;
import java.util.*;

public class ReverseSingleLinkedList{

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

        head = prev;
    }


    void display() {
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

            Node last = head;
            while( last.next != null)
            {
                last = last.next;
            }
            last.next = new_node;
            return ;

        }

    public static void main(String[] args)
    {
       ReverseSingleLinkedList list = new ReverseSingleLinkedList();
        Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number to insert (or 0 to quit): ");
        while (true) {
            int data = scanner.nextInt();
            if (data == 0) {
                break;
            }
             list.insertEnd(data);
        }
        scanner.close();
        System.out.print("traversing the list ");
        list.display();
         int nodeCount = countNodes();
        System.out.print("total no of nodes : " + nodeCount);
        System.out.println(" reversing the list............");
        list.reverse();
        System.out.print("\ntraversing the list ");
        list.display();
        System.out.println("total no of nodes : " + nodeCount);

    }
}

/*
D:\ADS Workspace\Hackerank>java ReverseLinkedList.java
Enter a number to insert (or 0 to quit): 1 3 3 4 9 8 7 6 0
traversing the list 1 3 3 4 9 8 7 6 total no of nodes : 8 reversing the list............

traversing the list 6 7 8 9 4 3 3 1 total no of nodes : 8
*/