import java.util.HashSet;

public class UniqueNumbers {
    public static void printUniqueNumbers(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Unique numbers in the array:");
        for (int num : arr) {
            if (!set.contains(num)) {
                System.out.print(num + " ");
                set.add(num);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 6};
        printUniqueNumbers(arr);
    }
}