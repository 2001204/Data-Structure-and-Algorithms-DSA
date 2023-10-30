// Quick Sorting 

class QuickSort
{
	public static void quicksort(int arr[], int low, int high)
	{
		if (low < high)
		{
		int pi = partition(arr,low, high);
		quicksort(arr,low, pi-1);  //left half of partition
		quicksort(arr, pi+1, high);   //right half of partition	
		}
	}
	static int partition (int arr[],int low, int high)
	{
		int pivot = arr[ high ];
		int i = low-1;
		for(int j =low; j<high; j++)
		{
			if(arr[j]< pivot)
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, high);
		return (i+1);
	}
	
	static void swap( int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] =arr[j];
		arr[j] = temp;
	}

	static void display(int arr[])
	{
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}	

	public static void main(String args[])
	{
		int arr[] = {23,85,42,63,12,75,16,40};
		int n = arr.length;		
		System.out.println("Before quick Sorting:  ");
        	display(arr);			
        	quicksort(arr, 0, n-1);
        	System.out.println("------------ ");
		System.out.println("After quick Sorting : ");
    		display(arr);					
	}
}

/*
Before Quick Sorting:
23 85 42 63 12 75 16 40 
------------
After Quick Sorting:
12 16 23 40 42 63 75 85 

*/