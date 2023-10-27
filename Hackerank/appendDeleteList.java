import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class appendDeleteList {
    public static void main(String[] args) throws NullPointerException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String t = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = appendDeleteLResult.appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


class appendDeleteLResult {

  
    public static String appendAndDelete(String s, String t, int k) {
        
        int commonLength = 0;

        // Find the length of the common prefix of s and t
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                commonLength++;
            } else {
                break;
            }
        }

        int operationsNeeded = (s.length() - commonLength) + (t.length() - commonLength);

        if (k >= s.length() + t.length() || (k >= operationsNeeded && (k - operationsNeeded) % 2 == 0)) {
            return "Yes";
        } else {
            return "No";
        }
}
        

     /*   int s1 = 0;
        int t1 = 0;
        
            while(s1 < s.length() && t1<t.length()){
                if(s.charAt(s1) == t.charAt(t1)){
                    s1++;
                    t1++;
                }
            }
        int length = s.length()-s1+ t.length()-t1;
        if (k<length){
            return "No";
        }
        if((k-length)%2 ==0){
            return "Yes";
        }
        if(k>=s.length()+ t.length()){
            return "Yes";
        }
        return "No";
    }*/
    
}

/*
Input (stdin)
ashley
ash
2
-----
Your Output (stdout)
No


*/

