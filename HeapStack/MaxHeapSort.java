//Maximum HeapSort

class MaxHeapSort{

void display(int arr[])
 {
 	int n = arr.length;
	for( int i=0; i<n ; i++)
	{
		System.out.println(arr[i]);
	}
}
//deleting root node and replacing with last node
void heapsort(int arr[])
{
	int n = arr.length;
	//build heap
	for(int i = n/2-1; i>=0; i--)
	{
		heapify(arr,n,i);
	}
	for(int i = n-1; i>0; i--)
	{
//replacement of last node with root element
		int temp = arr[0];
		arr[0] = arr[i];
		arr[i] = temp;
		heapify(arr, i, 0);              //balancing max heap
	}
}
public static void main(String args[])
 {
		MaxHeapSort h1=new MaxHeapSort();
		int arr[] ={40,20,50,30,10} ;
		System.out.println("Unsorted Array	: ");
		h1.display(arr);
		h1.heapsort(arr);
		System.out.println("Sorted Array by Max Heap   : ");
		h1.display(arr);
  }
//to construct max heap at root,LC,RC
  void heapify( int arr[], int n, int i)
  {
		//max heap

		int largest = i;      //i/2
		int l = 2*i+1;       //2i  LC
		int r = 2*i+2;       //2i+1 RC

		if( l<n && arr[l] > arr[largest] )
			largest =l;
		if( r<n && arr[r] > arr[largest] )
			largest =r;
		if(largest != i)
		{
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest]=temp;
			heapify(arr, n , largest);
		}
    	}
}

/*

D:\ADS Workspace\Tree>java MaxHeapSort.java
Unsorted Array  :
40
20
50
30
10
Sorted Array by Max Heap   :
10
20
30
40
50
*/
