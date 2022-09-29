import java.util.Scanner;

public class Ch02_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        sc.close();

        System.out.print(n % 10);
    }
}
