//Insertion sorting

class InsertionSort 
{
    static int min ;
    static void isort(int arr[]) 
    {
	int n = arr.length;
	for(int i = 0; i<n; i++)	    
	{
		int key = arr[i];
		int j = i-1;
		while(j >= 0 && arr[j]> key)
		{
			arr[j+1] = arr[j];
			j = j-1;
		}
		arr[j+1] = key;
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
        System.out.println("Before Insertion Sorting: ");
        display(arr);
        isort(arr);
        System.out.println("------------");
        System.out.println("After Insertion Sorting: ");
        display(arr);
    }
}

/*
java -cp /tmp/aFBpZQNkW9 InsertionSort
Before Insertion Sorting: 
23 85 42 63 12 75 16 40 
------------
After Insertion Sorting: 
12 16 23 40 42 63 75 85 
*/