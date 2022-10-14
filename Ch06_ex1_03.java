import java.util.Scanner;

public class Ch06_ex1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // 若每刀都與之前 n - 1 刀相交，則第 n 刀可以多切出 n 份
        System.out.print(1 + n * (n + 1) / 2);
    }
}
