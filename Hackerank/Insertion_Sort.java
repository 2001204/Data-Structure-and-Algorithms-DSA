//Insertion Sort - Part 1

import java.util.*;

public class Insertion_Sort {
    

    public static void sort(int n, int[] arr)
    {
        int key = arr[n - 1];
        for (int j = n - 2; j >= 0; j--)
        {
            if (arr[j] <= key)
            {
                arr[j + 1] = key;
                display(arr);
                return;
            } else {
                arr[j + 1] = arr[j];
                display(arr);
            }
        }
        arr[0] = key;
        display(arr);
    }

    public static void display(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 System.out.println("Enter no of element : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
 System.out.println("Enter element "+ i+ " : ");
            arr[i] = sc.nextInt();
        }
        sort(n, arr);
        sc.close();
    }
}

/*
D:\ADS Workspace\Hackerank>java Insertion_Sort.java
Enter no of element :
5
Enter element 0 :
89
Enter element 1 :
26
Enter element 2 :
45
Enter element 3 :
75
Enter element 4 :
20
89 26 45 75 75
89 26 45 45 75
89 26 26 45 75
89 89 26 45 75
20 89 26 45 75
*/