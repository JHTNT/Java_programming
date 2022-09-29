import java.util.Scanner;

public class Ch03_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x = sc.nextInt(), y = sc.nextInt();
        sc.close();

        System.out.print(s.substring(x, y));
    }
}
