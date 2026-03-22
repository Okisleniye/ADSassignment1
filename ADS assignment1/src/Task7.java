import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) reverse(sc.nextInt(), sc);
        sc.close();
    }

    public static void reverse(int n, Scanner sc) {
        if (n <= 0) return;
        int num = sc.nextInt();
        reverse(n - 1, sc);
        System.out.print(num + " ");
    }
}