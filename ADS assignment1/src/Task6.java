import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) System.out.println(power(sc.nextInt(), sc.nextInt()));
        sc.close();
    }

    public static long power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
}