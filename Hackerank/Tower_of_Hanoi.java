//Tower-of-Hanoi Problem

import java.io.*;
import java.util.*;

public class Tower_of_Hanoi {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter How many Disk : ");
        int n = sc.nextInt();
        toh(n,'A','B','C');
    }
    static void toh(int n,char start,char mid, char end){
        if(n==1)
            System.out.println("Disk "+ n +" moved from " +start+ " to " +end);
        else
        {
            toh(n-1, start, end, mid);
            System.out.println("Disk "+ n +" moved from " +start+ " to " +end);
            toh(n-1, mid,start, end);

        }
    }
}

/*

D:\ADS Workspace\Hackerank>java Tower_of_Hanoi.java
Enter How many Disk :
3
Disk 1 moved from A to C
Disk 2 moved from A to B
Disk 1 moved from C to B
Disk 3 moved from A to C
Disk 1 moved from B to A
Disk 2 moved from B to C
Disk 1 moved from A to C
*/