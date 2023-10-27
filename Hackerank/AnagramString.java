
//Java Anagrams

import java.util.Scanner;

public class AnagramString
{

	static boolean IsAnagram(String a, String b)
	{
        	String A=a ;                  // = a.toLowerCase();
        	String B=b ;                 // = b.toLowerCase();
        	if(A.length()!=B.length())
            	return false;

	        for(int i=0;i<A.length();i++)
        	{
            	int countA = 0;
            	int countB = 0;
            	for(int j=0 ;j<A.length() ;j++ )
           	{
                	if (A.charAt(i)==B.charAt(j))
                    	countA++;

       		         if (A.charAt(i)==B.charAt(j))
                	 countB++;
            }
            if(countA == countB )  continue;
            else  return false;
            }

        return true;
    }

 public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter 1 String: ");
        String a = sc.next();
System.out.println("Enter 2 Strings: ");
        String b = sc.next();
        sc.close();
        boolean result = IsAnagram(a, b);
        System.out.println( (result) ? "Anagrams" : "Not Anagrams" );
    }
}


/*
D:\ADS Workspace\Hackerank>java AnagramString.java
Enter 1 String:
DipAKWanI
Enter 2 Strings:
IAAniPkDw
Anagrams
==================
Enter 1 String:
Anagranms
Enter 2 Strings:
anagrams
Not Anagrams
*/