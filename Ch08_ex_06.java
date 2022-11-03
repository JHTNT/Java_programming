import java.util.Scanner;

public class Ch08_ex_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(), n = sc.nextInt();
        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        n = sc.nextInt();
        int q = sc.nextInt();
        int b[][] = new int[n][q];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < q; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int c[][] = new int[m][q];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.flush();
    }
}
