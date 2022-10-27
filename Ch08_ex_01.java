import java.util.Scanner;

public class Ch08_ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), min = 1000000;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] < min) min = a[i];
        }
        sc.close();
        System.out.println(min);
        for (int i : a) {
            System.out.println(i - min);
        }
    }
}
