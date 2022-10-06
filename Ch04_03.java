import java.util.Scanner;

public class Ch04_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        sc.close();

        System.out.printf("Hello %s, how are you. %s is a undergraduate student.", x, x);
    }
}
