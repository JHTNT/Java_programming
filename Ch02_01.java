import java.util.Scanner;

public class Ch02_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        System.out.print(a + b);
    }
}
