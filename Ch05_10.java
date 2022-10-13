import java.util.Scanner;

public class Ch05_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt();
        sc.close();

        // eec + cde = beb
        float c = (b * 101 + e * 10 - e * 111 - d * 10) / 101;
        if (c == (int) c && !(c == b || c == d || c == e)) {
            System.out.print((int) c);
        } else {
            System.out.print(-1);
        }
    }
}
