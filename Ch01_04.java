import java.util.Scanner;

public class Ch01_04 {
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        int a, b;

        a = keyin.nextInt();
        b = keyin.nextInt();
        keyin.close();
        System.out.print(a + b);
    }
}
