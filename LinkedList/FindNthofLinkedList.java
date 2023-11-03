//How to find the nth element from the end of the linked list

public class FindNthofLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        int n = 3; // Find the 3rd element from the end

        int nthFromEnd = list.findNthFromEnd(n);
        if (nthFromEnd != -1) {
            System.out.println("The " + n + "th element from the end is: " + nthFromEnd);
        } else {
            System.out.println("Invalid input or n is greater than the number of nodes.");
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public int findNthFromEnd(int n) {
        if (head == null || n <= 0) {
            return -1; // Invalid input
        }

        Node first = head;
        Node second = head;

        // Move the first pointer n nodes ahead
        for (int i = 0; i < n; i++) {
            if (first == null) {
                return -1; // n is greater than the number of nodes
            }
            first = first.next;
        }

        // Move both pointers until the first pointer reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second.data;
    }
}

/*
D:\ADS Workspace\LinkedList>java FindNthofLinkedList.java
The 3th element from the end is: 3
*/

