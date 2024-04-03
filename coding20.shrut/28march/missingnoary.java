public class MissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return totalSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10}; // Assuming one number is missing
        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing number in the array: " + missingNumber);
    }
}
