class Main {
    static int search(int arr[], int x, int l, int r) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return search(arr, x, l, mid - 1);
            return search(arr, x, mid + 1, r);
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2, 31, 45, 67, 74, 78, 89};
        int x = 29;
        int n = arr.length;
        int result = search(arr, x, 0, n - 1);
        if (result == -1)
            System.out.println(x + "Not found");
        else
            System.out.println(x + "Found at index " + result);
    }
}
/*

29 Not found

74 Found at index 4 

*/
