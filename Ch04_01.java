import java.util.Scanner;

public class Ch04_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        System.out.printf("You are %d years old.", x);
    }
}