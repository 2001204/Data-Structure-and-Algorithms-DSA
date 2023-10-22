import java.io.*;
import java.util.*;

/*
class TowerOfHanai
{
	
	static void toh(int n,char s,char inter, char d){
		if(n==1)
			System.out.println("Disk "+ n +" from" +s+ "to" +d);
		else
		{
			toh(n-1, s, d, inter);
			System.out.println("Disk "+ n +" from" +s+ "to" +d);
			toh(n-1, inter,s, d);
			
		}
	}

	public static void main(String args[]){
		
		int n=3;
		toh(n,'A','B','C');
	
	}
}


Disk 1 moved from A to C
Disk 2 moved from A to B
Disk 1 moved from C to B
Disk 3 moved from A to C
Disk 1 moved from B to A
Disk 2 moved from B to C
Disk 1 moved from A to C


*/


public class TowerOfHanai {

    public static void main(String[] args) 
	{
       			 Scanner sc= new Scanner(System.in);
System.out.print("Enter the no of Disk : ");
       			 int n = sc.nextInt();
       			 toh(n,'A','B','C');
    	}
    static void toh(int n,char start,char mid, char end)
	{
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
D:\ADS Workspace\1 Recursion>java TowerOfHanai.java
Enter the no of Disk : 3
Disk 1 moved from A to C
Disk 2 moved from A to B
Disk 1 moved from C to B
Disk 3 moved from A to C
Disk 1 moved from B to A
Disk 2 moved from B to C
Disk 1 moved from A to C
*/