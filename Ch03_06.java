import java.util.Scanner;

public class Ch03_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        sc.close();

        if (n >= str.length() || n < 0) {
            System.out.print("error");
        } else {
            System.out.print(str.charAt(n));
        }
    }
}
