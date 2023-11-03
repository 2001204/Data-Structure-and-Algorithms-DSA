//Find the start node of the loop in LinkedIn

public class StartNodeLinkedList {
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

        Node loopStart = list.detectAndFindLoopStart();
        if (loopStart != null) {
            System.out.println("The start node of the loop is at data: " + loopStart.data);
        } else {
            System.out.println("No loop found.");
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

    public Node detectAndFindLoopStart() {
        Node slow = head;
        Node fast = head;

        // Detect the loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break; // Loop detected
            }
        }

        // Check if there is no loop
        if (fast == null || fast.next == null) {
            return null; // No loop found
        }

        // Find the start of the loop
        Node finder = head;
        while (finder != slow) {
            finder = finder.next;
            slow = slow.next;
        }

        return finder;
    }
}

/*
D:\ADS Workspace\LinkedList>java StartNodeLinkedList.java
The start node of the loop is at data: 2
*/
