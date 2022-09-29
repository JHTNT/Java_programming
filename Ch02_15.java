import java.util.Scanner;

public class Ch02_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        sc.close();

        System.out.printf("%.1f", f * 10);
    }
}
