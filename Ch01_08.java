import java.util.Scanner;

public class Ch01_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n >= 90 && n <= 100) {
            System.out.print("A");
        } else if (n >= 80 && n < 90) {
            System.out.print("B");
        } else if (n >= 70 && n < 80) {
            System.out.print("C");
        } else if (n >= 60 && n < 70) {
            System.out.print("D");
        } else if (n >= 50 && n < 60) {
            System.out.print("E");
        } else if (n > 0 && n < 50) {
            System.out.print("Failed");
        } else {
            System.out.print("OOR");
        }
    }
}
