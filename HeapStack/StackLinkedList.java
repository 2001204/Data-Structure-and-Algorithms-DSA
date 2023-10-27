import static java.lang.System.exit;

class StackLinkedList {
    public static void main(String args[]) {
        SLL obj = new SLL();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);

        obj.display();       
        System.out.printf("Top Element is = %d .", obj.peek());
System.out.printf("\n");
        obj.pop();
        obj.pop();
        obj.display();
        System.out.printf("Top Element is =  %d. ", obj.peek());
    }
}

class SLL {
    Node top;

    private class Node {
        int data;
        Node next;
    }

    SLL() {
        top = null;
    }

    public void push(int x) {
        Node new_node = new Node();
        if (new_node == null) {
            System.out.println("\nStack Overflow");
            return;
        }
        new_node.data = x;
        new_node.next = top;
        top = new_node;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("\nStack is Empty");
            return -1; // Return a default value, or you can throw an exception here.
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        top = top.next;
    }

    public void display() {
        if (top == null) {
            System.out.println("\nStack Underflow");
            exit(1);
        } else {
            Node current = top;
            while (current != null) {
                System.out.print(current.data);
                current = current.next;
                if (current != null) {
                    System.out.print(" ---> ");
                }
            }
            System.out.println();
        }
    }
}

/*
PS D:\ADS Workspace\HeapStack> java StackLinkedList.java
4 ---> 3 ---> 2 ---> 1
Top Element is = 4 .
2 ---> 1
Top Element is =  2.
*/