import java.util.Scanner;

public class Ch07_ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.close();

        System.out.print(Math.sqrt(x));
    }
}
