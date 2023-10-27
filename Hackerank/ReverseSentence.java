/*
import java.util.*;
public class ReverseSentence
{
    public static void main(String[] args)
 	{
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter a sentence: ");
        	String str = scanner.nextLine();
        	scanner.close();

        	String reversed = reverseSentence(str);
        	System.out.println("Reversed sentence: " + reversed);
       }

    public static String reverseSentence(String sentence)
	 {
        int length = sentence.length();
	if (sentence.length() == 0)
	{
            return sentence;
        }
     	for (int i = length - 1; i >= 0; i--)
	 {
         	char firstChar = sentence.charAt(0);
       	 	String restOfString = sentence.substring(i);
        	String reversedRest = reverseSentence(restOfString);
        	return reverseSentence(reversedRest + firstChar);
        }
    }
}
*/

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        // Input sentence
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        // Reverse the sentence character by character
        String reversedSentence = reverseSentence(input);

        // Display the reversed sentence
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    // Function to reverse a sentence character by character
    public static String reverseSentence(String sentence) {
        int length = sentence.length();
        StringBuilder reversed = new StringBuilder(length);

        for (int i = length - 1; i >= 0; i--) {
            reversed.append(sentence.charAt(i));
        }

        return reversed.toString();
    }
}


/*

D:\ADS Workspace\Hackerank>java ReverseSentence.java
Enter a sentence: hello how are you
Reversed sentence: uoy era woh olleh

*/