//R3: Max element  10/10

import java.io.*;
import java.util.*;

public class MaximumNumber {
    
    static int max( int[] arr , int max , int i ){
        if(arr[i] > max )
            max = arr[ i ];
        if( i < arr.length-1 )
            return max( arr , max, ++i);
        return max;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        for( int j = 0 ;j < 10 ; j++){
            String line;
            try{
System.out.println("Give array {,} in Formate : ");
                line = sc.nextLine();
System.out.print("Maximum : ");
            }
            catch( NoSuchElementException e ){
                return;
            }
            line = line.replace("{", " ");
            line = line.replace("}"," ");

            String[] s = line.split(",");
            int[] arr = new int[ s.length ];
            
            //int max = 0;
            for( int i = 0 ; i < s.length; i++){
                    arr[i] = Integer.parseInt( s[i].trim() );  
                    //if( n > max )
                        //max = n;

            }
            System.out.println(max(arr, 0 , 0));
        }
    }
}

/*
D:\ADS Workspace\Hackerank>java MaximumNumber.java
Give array {,} in Formate :
{2,5,7,9,4,6,4,5}
Maximum :
9
Give array {,} in Formate :
{2,3,54,78,10}
Maximum :
78
*/