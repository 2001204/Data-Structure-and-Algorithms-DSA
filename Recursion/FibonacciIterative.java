import java.io.*;
import java.util.*;

public class FibonacciIterative {
    public static void main(String[] args) 
{
       // int n = 10;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of element : ");
		int n = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series (Iterative): ");
        for (int i = 0; i < n; i++) 
	{
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

/*
D:\ADS Workspace\1 Recursion>java FibonacciIterative.java
Enter the no of element : 10
Fibonacci Series (Iterative): 0 1 1 2 3 5 8 13 21 34
D:\ADS Workspace\1 Recursion>java FibonacciIterative.java
Enter the no of element : 20
Fibonacci Series (Iterative): 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
D:\ADS Workspace\1 Recursion>
*/