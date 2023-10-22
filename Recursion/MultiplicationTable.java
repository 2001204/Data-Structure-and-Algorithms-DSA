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

   		 public static void printMultiplicationTable(int n , int i)	
		 {
       			 if (i > 10) 
			{
       			     return; 
       			 }
        	System.out.println(n + " x " + i + " = " + (n * i ));
        	printMultiplicationTable(n , i + 1);
    		}

  }