import java.util.ArrayList;
import java.util.List;

public class MergeSortedLists {

    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        // Add any remaining elements from list1 (if any)
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        // Add any remaining elements from list2 (if any)
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Populate the input lists (assuming they are sorted)
        list1.add(1);
        list1.add(3);
        list1.add(5);

        list2.add(2);
        list2.add(4);
        list2.add(6);

        List<Integer> mergedList = mergeLists(list1, list2);

        System.out.println("Merged List: " + mergedList);
    }
}


/*
D:\ADS Workspace\LinkedList>java MergeSortedLists.java
Merged List: [1, 2, 3, 4, 5, 6]

*/
