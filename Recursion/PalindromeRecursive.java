import java.util.*;

public class PalindromeRecursive
 {
    public static void main(String[] args)
 {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String: ");
        String A =sc.next();

        if (isPalindrome(A))
	 {
            System.out.println(A + " is a palindrome.");
        } else {
            System.out.println(A + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String str)
 {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {

            return isPalindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }
}
/*
D:\ADS Workspace\1 Recursion>java PalindromeRecursive.java
Enter a String:
dipak
dipak is not a palindrome.

Enter a String:
MadaM
MadaM is a palindrome.

*/