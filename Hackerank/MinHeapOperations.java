import java.util.PriorityQueue;
import java.util.Scanner;

class MinHeapOperations 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
	System.out.println("Enter number of test cases : ");
        int t = scanner.nextInt(); // Number of test cases

	System.out.println("Enter number of Queries : ");
        while (t-- > 0)
	 {
            int q = scanner.nextInt(); // Number of queries in this test case

            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	    System.out.println("Enter Queries p/pp/t: ");
            while (q-- > 0) 
	    {
                String operation = scanner.next();
                	if (operation.equals("p"))
		 	{
                    		int x = scanner.nextInt();
                    		minHeap.offer(x); // Pushing element into the min heap
                    		System.out.println(minHeap.size());
                	} else if (operation.equals("pp"))
		 	{
                  	  	if (!minHeap.isEmpty())	
		 		{
                       	 		minHeap.poll(); // Popping element from the min heap
                    		}
                    	System.out.println(minHeap.size());
                } else if (operation.equals("t"))
		 {
                    if (!minHeap.isEmpty())
			 {
                        	System.out.println(minHeap.peek()); // Returning the top element
                    	} else {
                        	System.out.println(-1);
                    }
                }
            }
        }
    }
}
