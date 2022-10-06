import java.util.Scanner;

public class Ch04_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        sc.close();

        System.out.printf("Start%10.2fEnd\n", x);      // right-aligned
        System.out.printf("Start%-10.2fEnd\n", x);     // left-aligned
    }
}
