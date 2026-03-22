import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) System.out.println(len(sc.next()));
        sc.close();
    }

    public static int len(String s) {
        if (s.isEmpty()) return 0;
        return 1 + len(s.substring(1));
    }
}