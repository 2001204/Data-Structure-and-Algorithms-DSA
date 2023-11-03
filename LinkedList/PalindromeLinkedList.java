//How to check if the linked list is a palindrome in Java

public class PalindromeLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append('r');
        list.append('a');
        list.append('c');
        list.append('e');
        list.append('c');
        list.append('a');
        list.append('r');

        boolean isPalindromic = list.isPalindrome();
        if (isPalindromic) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
class Node {
    char data;
    Node next;

    public Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void append(char data) {
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

    public boolean isPalindrome() {
        if (head == null) {
            return true; // An empty list is considered a palindrome.
        }

        Node slow = head;
        Node fast = head;

        // Find the middle of the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        Node prev = null;
        Node current = slow;
        Node nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // Compare the first half with the reversed second half
        Node firstHalf = head;
        Node secondHalf = prev;

        while (firstHalf != null && secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false; // Not a palindrome
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true; // Palindrome
    }
}


/*
D:\ADS Workspace\LinkedList>java PalindromeLinkedList.java
The linked list is a palindrome.
*/

