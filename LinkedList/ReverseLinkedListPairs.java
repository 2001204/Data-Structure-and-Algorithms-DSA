public class ReverseLinkedListPairs
 {
    public static void main(String[] args) 
 {
        LinkedListPairs list = new LinkedListPairs();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        System.out.print("Original List: ");
        list.display();

        list.reverseInPairs();

        System.out.print("Reversed in Pairs: ");
        list.display();
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

class LinkedListPairs {
    Node head;

    public LinkedListPairs() {
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

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverseInPairs() {
        Node prev = null;
        Node current = head;
        Node nextNode = null;

        int count = 0;
        while (current != null && count < 2) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
            count++;
        }

        head = prev;

        if (nextNode != null) {
            head.next = nextNode;
        } else {
            head.next = null;
        }

        if (nextNode != null) {
            Node temp = head;
            while (temp.next != null && temp.next.next != null) {
                prev = temp.next;
                current = temp.next.next;
                nextNode = temp.next.next.next;

                count = 0;
                while (current != null && count < 2) {
                    current.next = prev;
                    prev = current;
                    current = nextNode;
                    nextNode = nextNode != null ? nextNode.next : null;
                    count++;
                }

                temp.next = prev;
                temp = current;
                temp.next = nextNode;
            }
        }
    }
}


