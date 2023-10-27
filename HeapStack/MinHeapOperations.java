import java.util.*;
import java.io.*;

public class MinHeapOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int q = sc.nextInt(); // Number of queries
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            while (q-- > 0) {
                String queryType = sc.next();

                if (queryType.equals("p")) {
                    int x = sc.nextInt();
                    minHeap.offer(x); // Push element to min heap
                    System.out.println(minHeap.size());
                } else if (queryType.equals("pp")) {
                    if (!minHeap.isEmpty()) {
                        minHeap.poll(); // Pop element from min heap
                    }
                    System.out.println(minHeap.size());
                } else if (queryType.equals("t")) {
                    if (!minHeap.isEmpty()) {
                        System.out.println(minHeap.peek()); // Get the top element
                    } else {
                        System.out.println(-1);
                    }
                }
            }
        }
    }
}

