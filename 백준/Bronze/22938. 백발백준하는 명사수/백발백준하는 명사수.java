import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int r1 = sc.nextInt();

        if (1L * (x - x1) * (x - x1) + 1L * (y - y1) * (y - y1) < 1L * (r + r1) * (r + r1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
