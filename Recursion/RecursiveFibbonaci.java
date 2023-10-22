import java.io.*;
import java.util.*;

class RecursiveFibbonaci
	{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no : ");
		int n = sc.nextInt();
		System.out.println("fibbonaci series of " + n +" element : ");
		
		for(int i=1 ; i<=n ; i++)
		{
			System.out.print(fibb(i) +" ");
		}
	
	}

	static int fibb(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return fibb(n-1) + fibb(n-2);
	}
	
}
/*
D:\ADS Workspace\1 Recursion>java RecursiveFibbonaci.java
Enter the no : 10
fibbonaci series of 10 element :
1 1 2 3 5 8 13 21 34 55

D:\ADS Workspace\1 Recursion>java RecursiveFibbonaci.java
Enter the no : 40
fibbonaci series of 40 element :
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269 2178309 3524578 5702887 9227465 14930352 24157817 39088169 63245986 102334155
*/

