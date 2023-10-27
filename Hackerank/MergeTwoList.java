//MergeTwo  Linked List

public class MergeTwoList {

    static class Node {
        public int data;
        public Node next;

        public Node(int nodeData)
	 {
            this.data = nodeData;
            this.next = null;
        }
    }
    static class SinglyLinkedList {
        public Node head;

        public SinglyLinkedList() {
            this.head = null;
        }
    }
    public static Node mergeLists(Node llist1, Node llist2)
 	{
        Node temp = new Node(-1); // temp node to simplify code.
        Node current = temp;

        while (llist1 != null && llist2 != null) {
            if (llist1.data < llist2.data) {
                current.next = llist1;
                llist1 = llist1.next;
            } else {
                current.next = llist2;
                llist2 = llist2.next;
            }
            current = current.next;
        }
        // If there are remaining nodes in llist1 or llist2, append them.
        if (llist1 != null) {
            current.next = llist1;
        } else {
            current.next = llist2;
        }

        return temp.next; // The merged list starts from the next node of the temp node.
    }


    public static void printLinkedList(Node node)
 {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList llist1 = new SinglyLinkedList();
        llist1.head = new Node(1);
        llist1.head.next = new Node(3);
        llist1.head.next.next = new Node(5);

        SinglyLinkedList llist2 = new SinglyLinkedList();
        llist2.head = new Node(2);
        llist2.head.next = new Node(4);
        llist2.head.next.next = new Node(6);

        System.out.println("Linked List 1:");
        printLinkedList(llist1.head);

        System.out.println("Linked List 2:");
        printLinkedList(llist2.head);

        Node mergedList = mergeLists(llist1.head, llist2.head);

        System.out.println("Merged List:");
        printLinkedList(mergedList);
    }
}

/*

D:\ADS Workspace\Hackerank>java MergeTwoList.java
Linked List 1:
1 -> 3 -> 5 -> null
Linked List 2:
2 -> 4 -> 6 -> null
Merged List:
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
*/
