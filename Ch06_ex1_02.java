import java.util.Scanner;

public class Ch06_ex1_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x, y, z;
        sc.close();

        x = n / 100;
        y = n % 100 / 10;
        z = n % 10;
        if (x * x * x + y * y * y + z * z * z == n) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
