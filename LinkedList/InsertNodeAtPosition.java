// Method to insert a node at a given position

public class InsertNodeAtPosition {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a node at a given position
    void InsertAtPos(int position, int data) {
        Node new_node = new Node(data);
        
        if (position < 1) {
            System.out.println("Invalid position");
            return; // Exit the method if the position is invalid
        }

        if (position == 1) {
            new_node.next = head;
            head = new_node;
        } else {
            Node previous = head;
            for (int i = 1; i < position - 1; i++) {
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

    void Display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertNodeAtPosition L1 = new InsertNodeAtPosition();

        L1.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node four = new Node(40);

        L1.head.next = second;
        second.next = third;
        third.next = four;

        System.out.print("Linked list before insertion: ");
        L1.Display();

        L1.InsertAtPos(2, 15); // Insert 15 at position 2
        System.out.print("Linked list after insertion: ");
        L1.Display();
    }
}


/*
D:\ADS Workspace\LinkedList>java InsertNodeAtPosition.java
Linked list before insertion: 10 --> 20 --> 30 --> 40 --> null
Linked list after insertion: 10 --> 15 --> 20 --> 30 --> 40 --> null
*/