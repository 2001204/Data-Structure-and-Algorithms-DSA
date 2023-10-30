//selection sorting

class SelectionSort 
{
    static int min ;
    static void ssort(int arr[]) 
    {
	    int n = arr.length;
	    for(int i = 0; i<n-1; i++)
	    {
	    	int min = i;
	    	for(int j=i+1; j<n; j++)
	    	{
			    if(arr[j]< arr[min])
				    min = j;
		    }
		    int temp = arr[min];
		    arr[min]= arr[i];
		    arr[i] = temp;
	    }
	
       
    }

    static void display(int arr[]) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " "); 
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {23, 85, 42, 63, 12, 75, 16, 40};
        int n = arr.length;
        System.out.println("Before Selection Sorting: ");
        display(arr);
        ssort(arr);
        System.out.println("------------");
        System.out.println("After Selection Sorting: ");
        display(arr);
    }
}
/*
java -cp /tmp/aFBpZQNkW9 SelectionSort
Before Selection Sorting: 
23 85 42 63 12 75 16 40 
------------
After Selection Sorting: 
12 16 23 40 42 63 75 85 
*/