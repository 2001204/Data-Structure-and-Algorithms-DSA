import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of Queries : ");
        int q = scanner.nextInt();
        Stack<Integer> enqueueStack = new Stack<>();
        Stack<Integer> dequeueStack = new Stack<>();

        for (int i = 0; i < q; i++) {
            System.out.println("Enter yout choice : ");
            System.out.println("1. Enqueue ");
            System.out.println("2. Dequeue ");
            System.out.println("3. Print : ");
            int queryType = scanner.nextInt();

            switch (queryType) {
                case 1: 
                    System.out.println("Enter an element To insert : ");
                    int element = scanner.nextInt();
                    enqueueStack.push(element);
                    break;

                case 2: // Dequeue
                    if (dequeueStack.isEmpty()) {
                        // Transfer elements from enqueue stack to dequeue stack
                        while (!enqueueStack.isEmpty()) {
                            dequeueStack.push(enqueueStack.pop());
                        }
                        System.out.println("Element Deleted successfully");
                    }
                    if (!dequeueStack.isEmpty()) {
                        dequeueStack.pop();
                    }
                    break;

                case 3: // Print front element
                    System.out.println("Printing first element: ");
                    if (dequeueStack.isEmpty()) {
                        // Transfer elements from enqueue stack to dequeue stack
                        while (!enqueueStack.isEmpty()) {
                            dequeueStack.push(enqueueStack.pop());
                        }
                    }
                    if (!dequeueStack.isEmpty()) {
                        System.out.println(dequeueStack.peek());
                    }
                    break;
            }
        }

        scanner.close();
    }
}
