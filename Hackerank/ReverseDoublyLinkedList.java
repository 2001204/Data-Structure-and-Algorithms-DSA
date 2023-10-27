//ADS Reverse a Doubly Linked List
class ReverseDoublyLinkedList {
    static class Node {
        public int data;
        public Node next;
        public Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node reverse(Node llist) {
        Node current = llist;
        Node prev = null;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            current.prev = next;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void display(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;  // Initialize an empty list

        int[] dataValues = {10, 23, 44, 20, 25, 56, 80};
        Node prev_Node = null;

        for (int data : dataValues)
	{
            Node new_Node = new Node(data);
            if (prev_Node != null)
	   {
                prev_Node.next = new_Node;
                new_Node.prev = prev_Node;
            }
            prev_Node = new_Node;
            if (head == null) {
                head = new_Node;
            }
        }

        System.out.println("Before Reverse Linked List : ");
        display(head);
        System.out.println("\n---------------------------------------------");

        System.out.println("After Reverse Linked List : ");
        Node reversedList = reverse(head);
        display(reversedList);
    }
}


/*
D:\ADS Workspace\Hackerank>java ReverseDoublyLinkedList.java
Before Reverse Linked List :
10 23 44 20 25 56 80
---------------------------------------------
After Reverse Linked List :
80 56 25 20 44 23 10
*/
