import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {
    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int[] result;
        int index = 0;
        for (int num : arr) {
            if (set.add(num)) {
                index++;
            }
        }
        result = new int[index];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));
    }
}
