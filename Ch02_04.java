import java.util.Scanner;

public class Ch02_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        sc.close();

        System.out.print((int) Math.round(1/d));
    }
}
