import java.util.Scanner;

public class Ch05_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                // repeat() needs Java 11+
                // System.out.println(" ".repeat(n - i) + "*".repeat(i * 2 + 1));
                System.out.print(new String(new char[n - i - 1]).replace('\0', ' ') + 
                                   new String(new char[i * 2 + 1]).replace('\0', '*'));
            } else {
                System.out.println(new String(new char[n - i - 1]).replace('\0', ' ') + 
                                   new String(new char[i * 2 + 1]).replace('\0', '*'));
            }
        }
    }
}
