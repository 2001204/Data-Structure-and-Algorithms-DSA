import java.io.*;
import java.util.*;


/*
class RecursiveFact{
	
	static int fact(int n)
	{	
		if(n<=1)
			return n;
		else
			return n*fact(n-1);
	}
	public static void main(String args[])
{
		System.out.println("Factorial of " + n +" : ");
		System.out.println(fact(5));
	
	}
}
*/

class RecursiveFact{
	
	static int fact(int n)
	{	
		if(n<=1)
			return n;
		else
			return n*fact(n-1);
	}
	public static void main(String args[])
{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no : ");
		int n = sc.nextInt();
		System.out.println("Factorial of " + n +" : ");
		System.out.println(fact(n));
	
	}
}

/*
D:\ADS Workspace\1 Recursion>java RecursiveFact.java
Enter the no : 5
Factorial of 5 :
120
*/
