import java.util.Arrays;

public class RotateLeftByK {
    public static void rotateLeftByK(int[] arr, int k) {
        if (arr == null || arr.length <= 1 || k <= 0) {
            return; // No rotation needed
        }
        int n = arr.length;
        k = k % n; // To handle cases where k > n
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5,2};
        int k = 2;
        rotateLeftByK(arr, k);
        System.out.println("Array after rotating left by " + k + " positions: " + Arrays.toString(arr));
    }
}
