public class FibonacciSeries {
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        int n = 11; 
        printFibonacci(n);
    }
}
