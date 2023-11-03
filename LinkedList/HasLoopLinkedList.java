//How to detect a loop in a linked list in Java

public class HasLoopLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        Node lastNode = list.head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = list.head.next;

        boolean hasLoop = list.hasLoop();
        if (hasLoop) {
            System.out.println("The linked list has a loop.");
        } else {
            System.out.println("The linked list does not have a loop.");
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

    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Loop detected
            }
        }

        return false; // No loop found
    }
}
/*
D:\ADS Workspace\LinkedList>java HasLoopLinkedList.java
The linked list has a loop.

*/

