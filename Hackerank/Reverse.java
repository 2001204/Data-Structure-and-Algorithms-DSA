import java.util.Scanner;

public class Reverse {

    static Node head;
    int count = 0; // To keep track of the count of elements

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static int countNodes() {
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

    void insertEnd(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new_node;
            return;
        }
        new_node.next = null;

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
    }

    public static void main(String[] args) {
        Reverse list = new Reverse();
        Scanner scanner= new Scanner(System.in);
System.out.print("Enter Nodes( 0 for exit): ");
        while (true) {
            int data = scanner.nextInt();
            if (data == 0) {
                break;
            }
            list.insertEnd(data);
        }
        scanner.close();
        
        System.out.print("Traversing the list: ");
        list.display();
        int nodeCount = countNodes();
        System.out.println("\nTotal number of nodes: " + nodeCount);

        System.out.println("Reversing the list............");
        list.reverse();
        System.out.print("Traversing the reversed list: ");
        list.display();
    }
}

/*
D:\ADS Workspace\Hackerank>java Reverse.java
Enter Nodes( 0 for exit): 1
59
65
21
51
32
30
0
Traversing the list: 1 59 65 21 51 32 30
Total number of nodes: 7
Reversing the list............
Traversing the reversed list: 30 32 51 21 65 59 1
*/
