import java.io.*;
import java.util.*;

public class GCDRecursive
 {
    public static void main(String[] args)
 {
       Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String: ");
        String n =sc.next();

        String formula = gcd(n);
        System.out.println("Formula for GCD of " + n + " integers: " + formula);
    }

    public static String gcd(int n) {
        if (n == 1) {
            return "int";
        } else
	 {
            return "gcd(int, " + gcd(n - 1) + ")";
        }
    }
}
