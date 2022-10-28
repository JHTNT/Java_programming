import java.util.Scanner;

public class Ch08_ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        m = sc.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt() + a[i];
        }
        sc.close();

        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
