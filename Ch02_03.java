import java.util.Scanner;

public class Ch02_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x, y;
        double r;
        x = sc.nextFloat();
        y = sc.nextFloat();
        sc.close();

        r = x * (y * 2 / 9.8);
        System.out.printf("%.2f", r);
    }
}
