//Add two numbers represented by a linked list in Java

public class AddTwoNoLinkedList {
    public static void main(String[] args) {
        LinkedList num1 = new LinkedList();
        LinkedList num2 = new LinkedList();

        // Represent numbers in reverse order (1234 becomes 4->3->2->1)
        num1.append(2);
        num1.append(4);
        num1.append(3);

        num2.append(5);
        num2.append(6);
        num2.append(4);

        System.out.print("Number 1: ");
        num1.display();

        System.out.print("Number 2: ");
        num2.display();

        LinkedList sum = LinkedList.add(num1, num2);

        System.out.print("Sum: ");
        sum.display();
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

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static LinkedList add(LinkedList l1, LinkedList l2) {
        LinkedList result = new LinkedList();
        Node p = l1.head;
        Node q = l2.head;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.data : 0;
            int y = (q != null) ? q.data : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            result.append(sum % 10);

            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        if (carry > 0) {
            result.append(carry);
        }

        return result;
    }
}

/*
D:\ADS Workspace\LinkedList>java AddTwoNoLinkedList.java
Number 1: 2 4 3
Number 2: 5 6 4
Sum: 7 0 8
*/

