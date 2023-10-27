import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class EqualStack {
    public static void main(String[] args) throws IOException
 {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        Stack<Integer> st3=new Stack<>();
        int height1=0;
        int height2=0;
        int height3=0;
      for(int i=h1.size()-1;i>=0;i--){
          height1=height1+h1.get(i);
          st1.push(height1);
          
          
          
      }
          for(int i=h2.size()-1;i>=0;i--){
          height2=height2+h2.get(i);
          st2.push(height2);
          
          
          
      }
          for(int i=h3.size()-1;i>=0;i--){
          height3=height3+h3.get(i);
          st3.push(height3);
          
          
          
      }
        while(true){
            if(st1.empty()||st2.empty()||st3.empty()){
                return 0;
            }
            int theight1=st1.peek();
            int theight2=st2.peek();
            int theight3=st3.peek();
            
            
            if(theight1==theight2 && theight2==theight3){
                return st1.peek();
            }
            
            if(theight1>=theight2&&theight1>=theight3){
                st1.pop();
                
            }
            else if(theight2>=theight1&&theight2>=theight3){
           
                st2.pop();
                
            }
             else if(theight3>=theight2&&theight3>=theight1){
           
                st3.pop();
                
            }
        }

    }

}



