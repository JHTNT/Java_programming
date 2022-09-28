import java.util.Scanner;

public class Ch02_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dis = sc.nextInt();
        float fuel = sc.nextFloat();
        sc.close();

        System.out.printf("%.2f", dis / fuel);
    }
}
