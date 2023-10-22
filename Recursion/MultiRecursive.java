import java.io.*;
import java.util.*;

public class MultiplicationTable 
{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the no : ");
			int n = sc.nextInt();
			System.out.println("Multiplication Table of  " + n +" : ");
			printMultiplicationTable(n , 1); 
	
		}
   		 public static void Table(int n , int i)	
		 {
       			 if (i > 10) 
			{
       			     return; 
       			 }
        	System.out.println(n + " x " + i + " = " + (n * i ));
        	Table(n , i + 1);
    		}

  }

/*
D:\ADS Workspace\1 Recursion>java MultiplicationTable.java
Enter the no : 2
Multiplication Table of  2 :
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20

D:\ADS Workspace\1 Recursion>java MultiplicationTable.java
Enter the no : 8
Multiplication Table of  8 :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 4 = 32
8 x 5 = 40
8 x 6 = 48
8 x 7 = 56
8 x 8 = 64
8 x 9 = 72
8 x 10 = 80
*/