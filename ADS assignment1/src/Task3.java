import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) System.out.println(isPrime(sc.nextInt(), 2) ? "Prime" : "Composite");
        sc.close();
    }

    public static boolean isPrime(int n, int d) {
        if (n <= 1) return false;
        if (d * d > n) return true;
        if (n % d == 0) return false;
        return isPrime(n, d + 1);
    }
}