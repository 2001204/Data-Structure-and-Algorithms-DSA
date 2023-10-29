import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;


public class Solution {

        public static void main(String[] args) 
        {
            Scanner scanner = new Scanner(System.in);
            QueueLinkedList queue = new QueueLinkedList();

        while (true) 
        {
            System.out.println("Menu:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("--------------------");
            System.out.println("Enter your Choice : ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter element: ");
                    int item = scanner.nextInt();
                    queue.insert(item);
                    break;
                case 2:
                    queue.delete();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }
    }

}

class QueueLinkedList {
    private LinkedList<Integer> queue = new LinkedList<>();

    public void insert(int item) 
    {
        queue.addLast(item);
    }
    public void delete() 
    {
        if (queue.isEmpty()) 
        {
            System.out.println("Queue is empty");
        } else {
            queue.removeFirst();
        }
    }

    public void display() 
    {
        if (queue.isEmpty()) {
            System.out.println("NULL");
        } else {
            for (int item : queue) {
                System.out.print("->" + item);
            }
            System.out.println();
        }
    }
}
