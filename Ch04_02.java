import java.util.Scanner;

public class Ch04_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        System.out.printf("%d add %d are %d.", x, y, x + y);
    }
}
