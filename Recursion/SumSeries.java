import java.io.*;
import java.util.*;

public class SumSeries {

public static void main(String[] args) 
{
       // int n = 5; 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no : ");
		int n = sc.nextInt();
        int result = Sum(n);
        System.out.println("Sum series for " + n + " is: " + result);
    }
    public static int Sum(int n)
 {
        if (n == 1) {
            return 1; 
        } 
else
 {
            
return n + Sum(n - 1); 
        }
    }

    
}
/*

D:\ADS Workspace\1 Recursion>java SumSeries.java
Sum series for 5 is: 15

D:\ADS Workspace\1 Recursion>java SumSeries.java
Enter the no : 10
Sum series for 10 is: 55
*/