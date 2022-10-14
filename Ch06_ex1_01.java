import java.util.Scanner;

public class Ch06_ex1_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), F = sc.nextInt();
        sc.close();

        if (A == 0 || F == 0) {     // if no output
            System.out.print("X");
            return;
        }
        for (int i = 0; i < F; i++) {
            for (int j = 1; j <= A; j++) {
                for (int k = 0; k < j; k++) System.out.print(j);
                System.out.println();
            }
            for (int j = A - 1; j > 0; j--) {
                for (int k = 0; k < j; k++) System.out.print(j);
                System.out.println();
            }
            System.out.println();
        }
    }
}
