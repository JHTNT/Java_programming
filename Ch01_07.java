import java.util.Scanner;

public class Ch01_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c, d;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        sc.close();

        d = (a + b) * c / 2;
        System.out.print(d);
    }
}
