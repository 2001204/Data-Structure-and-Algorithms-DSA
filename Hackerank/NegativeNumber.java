import java.util.ArrayList;

public class NegativeNumber {

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        ArrayList<Integer> negArrayList = new ArrayList<>();
        ArrayList<Integer> posiArrayList = new ArrayList();

        for (int n : arr) {
            if (n < 0) {
                negArrayList.add(n);
            } else {
                posiArrayList.add(n);
            }
        }

        negArrayList.addAll(posiArrayList);

        for (int n : negArrayList) {
            System.out.print(n + " ");
        }
    }
}
/*
-12 -13 -5 -7 -3 -6 11 6 5
*/