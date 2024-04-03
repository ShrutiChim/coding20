import java.util.HashSet;

public class CommonElements {
    public static void findCommonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Common elements between the two arrays:");
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        findCommonElements(arr1, arr2);
    }
}
