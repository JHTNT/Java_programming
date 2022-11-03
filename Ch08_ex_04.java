import java.util.Scanner;

public class Ch08_ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        n = sc.nextInt();
        m = sc.nextInt();
        int b[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt() + a[i][j];
            }
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j : b[i]) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
        System.out.flush();
    }
}
