//R1: Sum of the series 1 – 1/2 + 1/3 – 1/4 … 1/N    i/p:  n=3

import java.io.*;
import java.util.*;

public class SumofSeries {

    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
System.out.println("Enter positive Integer No: ");
        int n=scan.nextInt();

        double res=SumSeries(1,n,0);
        System.out.println(res);
        
        
    }
    public static float SumSeries(int i, int a, float f)
    {
            if(i>a)
            return f;
    else
    {
        if(i%2 == 0)
            f = f - (float)1/i;
        else
            f = f + (float)1/i;
        return SumSeries(i+1, a, f);
    }
    
}
}

/*
D:\ADS Workspace\Hackerank>java SumofSeries.java
Enter positive Integer No:
3
0.8333333730697632
*/
