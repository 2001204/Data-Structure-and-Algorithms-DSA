//Stack Operation in One Program

import java.util.Scanner;

public class StackApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s1 = new Stack(100);
        int choice, a;

        while (true) {

            System.out.println("Stack Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. IsEmpty");
            System.out.println("5. IsFull");
            System.out.println("6. Exit");
System.out.println("-------------------------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Element to push: ");
                    a = sc.nextInt();
                    s1.push(a);
                    break;
                case 2:
                        long popped = s1.pop();
                        System.out.println("Popped element: " + popped);
                        break;
                case 3:

                        long pe = s1.peek();
                        System.out.println("Peek element: " + pe);

                    break;
                case 4:
                    if (s1.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                case 5:
                    if (s1.isFull()) {
                        System.out.println("Stack is full.");
                    } else {
                        System.out.println("Stack is not full.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class Stack {
    private int max;
    private long[] stackArray;
    private int top;

    Stack(int s) {
        max = s;
        stackArray = new long[max];
        top = -1;
    }

    void push(long j) {
        stackArray[++top] = j;
    }

    long pop() {
        return stackArray[top--];
    }

    long peek() {
        return stackArray[top];
    }

    boolean isEmpty() {
        return (top == -1);
    }

    boolean isFull() {
        return (top == max - 1);
    }
}

