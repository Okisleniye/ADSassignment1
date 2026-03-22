import java.util.Scanner;

public class Main {

    // Task 1
    public static void printDigits(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    // Task 2
    public static double sumArray(int[] arr, int n) {
        if (n <= 0) return 0;
        return arr[n - 1] + sumArray(arr, n - 1);
    }

    // Task 3
    public static boolean isPrime(int n, int divisor) {
        if (n <= 1) return false;
        if (divisor * divisor > n) return true;
        if (n % divisor == 0) return false;
        return isPrime(n, divisor + 1);
    }

    // Task 4
    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // Task 5
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Task 6
    public static long power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // Task 7
    public static void reverse(int n, Scanner sc) {
        if (n == 0) return;
        int num = sc.nextInt();
        reverse(n - 1, sc);
        System.out.print(num + " ");
    }

    // Task 8
    public static boolean Digits(String s) {
        if (s.isEmpty()) return true;
        if (!Character.isDigit(s.charAt(0))) return false;
        return Digits(s.substring(1));
    }

    // Task 9
    public static int count(String s) {
        if (s.isEmpty()) return 0;
        return 1 + count(s.substring(1));
    }

    // Task 10
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}