import java.util.Scanner;

public class Ch05_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double tax = 0;
        sc.close();

        if (x > 30000) {
            tax = (x - 30000) * 0.1 + 15000 * 0.05;
        } else if (x > 15000) {
            tax = (x - 15000) * 0.05;
        }
        System.out.printf("%.02f", tax);
    }
}
