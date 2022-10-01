import java.util.Scanner;

public class Ch03_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), ans = "";
        sc.close();

        for (int i = 0; i < str.length(); i += 3) {
            ans += str.charAt(i);
        }
        System.out.print(ans);
    }
}
