import java.util.Arrays;

public class ArraySortHalf {
    public static void sortHalfAscendingDescending(int[] arr) {
        int mid = arr.length / 2;
        Arrays.sort(arr, 0, mid); // Sort first half in ascending order
        Arrays.sort(arr, mid, arr.length); // Sort second half in descending order
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2, 7, 4, 6};
        sortHalfAscendingDescending(arr);
    }
}
