public class ArmstrongCheck {
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int n = String.valueOf(num).length();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }
        return sum == originalNum;
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println(num + " is Armstrong: " + isArmstrong(num));
    }
}
