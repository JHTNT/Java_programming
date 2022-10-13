import java.util.Scanner;

public class Ch05_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt();
        sc.close();

        // abc + gch = eeid
        // g0h = 1108 - 763 - 30 - i * 10
        int tmp = e * 1100 + d - a * 100 - b * 10 - c * 11;
        int g = tmp / 100, i = tmp % 100 / 10, h = tmp % 10;
        System.out.println(g);
        System.out.println(h);
        System.out.print(i);
    }
}
