import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            fillArray(arr, 0, sc);
            System.out.println(sumArray(arr, n) / n);
        }
        sc.close();
    }

    public static void fillArray(int[] arr, int i, Scanner sc) {
        if (i == arr.length) return;
        arr[i] = sc.nextInt();
        fillArray(arr, i + 1, sc);
    }

    public static double sumArray(int[] arr, int n) {
        if (n <= 0) return 0;
        return arr[n - 1] + sumArray(arr, n - 1);
    }
}