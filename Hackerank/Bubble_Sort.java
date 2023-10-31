//ADS4:Bubble Sort

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bubble_Sort {

    public static void main(String[] args) {
        
        int arr[] = {3,5,8,4,1,9,-2};

        int n = arr.length;
        bsort(arr);
        System.out.print("["); 
        display(arr);
        System.out.print("]"); 
    }
    static void display(int arr[]) 
    {
        for (int i = 0; i < arr.length; i++) 

        {
            System.out.print(arr[i]); 
            if ( i < arr.length -1)
                System.out.print(", ");

        }
}
    public static void bsort(int arr[]) 

    {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) 

        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                }
            }
        }
    }
}

/*
D:\ADS Workspace\Hackerank>java Bubble_Sort.java
[-2, 1, 3, 4, 5, 8, 9]
*/