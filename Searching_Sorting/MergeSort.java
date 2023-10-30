class MergeSort{

	static void mergeSort( int arr[],int l,int h)
	{
	if(l<h)
	{
		int mid = l + ( h- l)/2;
		mergeSort(arr,l,mid); //divide left sub problem
		mergeSort(arr, mid+1, h);   //divide right sub problm
		merge(arr,l,mid,h);
			
	}
	}
static void merge( int arr[],int l, int mid, int h)
	{
		int n1 = mid -l +1;  //size of left side
		int n2 = h-mid;	 //size of right side
		int L[] = new int[n1];  //create left array
		int R[] = new int[n2];	 //create right array
		for(int i=0; i<n1; i++)  //shift array element to left array 
		{
			L[i] = arr[l+i];
		}
		for(int j=0; j<n2; j++)  //shift array elements to right array
		{
			R[j] = arr[mid+1+j];
		}
		int i = 0, j =0;
		int k = l;
		while(i<n1 && j<n2)
		{
			if(L[i]<= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}	
			k++;
		}
		while(i<n1)
		{		
			arr[k] = L[i];
			i++;
			k++;		
		}
		while(j<n2)
		{		
			arr[k] = R[j];
			j++;
			k++;		
		}
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
		System.out.println("Before Merge Sorting:  ");
        	display(arr);			
        	mergeSort(arr,0,n-1);
        	System.out.println("------------ ");
		System.out.println("After Merge Sorting : ");
    		display(arr);					
	}
}

/*
java -cp /tmp/EXT1MlREZ7 MergeSort
Before Merge Sorting:  
23 
85 
42 
63 
12 
75 
16 
40 
------------ 
After Merge Sorting : 
12 
16 
23 
40 
42 
63 
75 
85 

*/