//Bubble sorting

class BubbleSort {
    public static void bsort(int arr[]) 
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
        System.out.println("Before Bubble Sorting: ");
        display(arr);
        bsort(arr);
        System.out.println("------------");
        System.out.println("After Bubble Sorting: ");
        display(arr);
    }
}
/*
java -cp /tmp/aFBpZQNkW9 BubbleSort
Before Bubble Sorting: 
23 85 42 63 12 75 16 40 
------------
After Bubble Sorting: 
12 16 23 40 42 63 75 85 
*/