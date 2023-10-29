import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter no of Queries : ");
        int q = scanner.nextInt();
        Stack<Integer> enqueueStack = new Stack<>();
        Stack<Integer> dequeueStack = new Stack<>();

        for (int i = 0; i < q; i++) {
            int queryType = scanner.nextInt();

            switch (queryType) {
                case 1: 
                    //System.out.println("Enter an element To insert : ");
                    int element = scanner.nextInt();
                    enqueueStack.push(element);
                    break;

                case 2: 
                    if (dequeueStack.isEmpty()) {
        
                        while (!enqueueStack.isEmpty()) {
                            dequeueStack.push(enqueueStack.pop());
                        }
                    }
                    if (!dequeueStack.isEmpty()) {
                        dequeueStack.pop();
                    }
                    System.out.println("Element Deleted successfully");
                    break;

                case 3: 
                    System.out.println("Printing first element: ");
                    if (dequeueStack.isEmpty()) {
                       
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
