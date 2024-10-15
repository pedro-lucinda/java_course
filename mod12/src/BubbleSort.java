import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        List<Integer> arrToSort = new ArrayList<>(Arrays.asList(4, 4, 9, 1, 1, 6));
        bubbleSort.sort(arrToSort);
        System.out.println(arrToSort);
    }

    public List<Integer> sort(List<Integer> arr) {
        int n = arr.size();

        // Bubble sort implementation
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }

        return arr;
    }
}
