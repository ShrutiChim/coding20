public class PalindromeCheck {
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return originalNum == reversed;
    }

    public static void main(String[] args) {
        int number1 = 12321; // Palindrome number
        int number2 = 12345; // Not a palindrome number

        System.out.println(number1 + " is palindrome: " + isPalindrome(number1));
        System.out.println(number2 + " is palindrome: " + isPalindrome(number2));
    }
}
