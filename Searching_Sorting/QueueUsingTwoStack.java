import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        Stack<Integer> enqueueStack = new Stack<>();
        Stack<Integer> dequeueStack = new Stack<>();

        for (int i = 0; i < q; i++) {
            int queryType = scanner.nextInt();

            switch (queryType) {
                case 1: 
                    int element = scanner.nextInt(); 
                    enqueueStack.push(element);      // Enqueue
                    break;

                case 2: 
                    if (dequeueStack.isEmpty()) {
                        // Transfer elements from enqueue stack to dequeue stack
                        while (!enqueueStack.isEmpty()) {
                            dequeueStack.push(enqueueStack.pop());      // Dequeue
                        }
                    }
                    if (!dequeueStack.isEmpty()) {
                        dequeueStack.pop();
                    }
                    break;

                case 3: 
                    if (dequeueStack.isEmpty()) {
                        // Transfer elements from enqueue stack to dequeue stack
                        while (!enqueueStack.isEmpty()) {
                            dequeueStack.push(enqueueStack.pop());     // Print front element
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
