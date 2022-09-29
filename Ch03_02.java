import java.util.Scanner;

public class Ch03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        sc.close();

        int ans = a.equals(b) ? 1 : 0;
        System.out.print(ans);
    }
}
