import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Ch05_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt();
        int g = -1, h = -1, i = -1;
        sc.close();

        HashSet<Integer> num = new HashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        num.remove(a); num.remove(b); num.remove(c);
        num.remove(d); num.remove(e);

        // abc + gch = eeid
        int left = a * 100 + b * 10 + c * 11;
        int right = e * 1100 + d;
        for (int x : num) {
            for (int y : num) {
                if (y == x) continue;
                for (int z : num) {
                    if (z == x || z == y) continue;
                    if (left + x * 100 + y == right + z * 10) {
                        g = x; h = y; i = z;
                    }
                }
            }
        }

        if (g == -1) {
            System.out.println(g);
        } else {
            System.out.println(g);
            System.out.println(h);
            System.out.print(i);
        }
    }
}
