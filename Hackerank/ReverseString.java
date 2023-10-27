
//Java String Reverse

import java.io.*;
import java.util.*;

public class ReverseString {

    public static void main(String[] args)
   {

        Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String: ");
        String A =sc.next();
        String reverse = "";

        for(int i = A.length()-1; i>=0 ; i-- )
        {
            reverse = reverse + A.charAt(i);
        }


System.out.println("Reversed String: " + reverse);
System.out.print("Is Equal : ");
        if(reverse.equals(A))
         System.out.print("Yes");
         else
         System.out.print("No");

    }
}


/*
D:\ADS Workspace\Hackerank>java ReverseString.java
Enter a String:
Hello
Reversed String: olleH
Is Equal : No

Enter a String:
madam
Reversed String: madam
Is Equal : Yes
*/