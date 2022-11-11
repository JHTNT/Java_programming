import java.util.Scanner;

public class Ch08_hw_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mag[] = new int[n], mag_rev[] = new int[n];
        for (int i = 0; i < n; i++) {
            mag[i] = sc.nextInt();
            mag_rev[i] = mag[i] / 10 + mag[i] % 10 * 10;
        }
        sc.close();

        int front = 0, back = n - 1, cnt = 0;
        while (front != back) {
            if (cnt % 2 == 0) {
                for (int i = front; i <= back; i++) {
                    System.out.print(mag[i] + " ");
                }
                System.out.println();
                front++;
            } else {
                for (int i = back; i >= front; i--) {
                    System.out.print(mag_rev[i] + " ");
                }
                System.out.println();
                back--;
            }
            cnt++;
        }
        if (cnt % 2 == 0) {
            System.out.print(mag[front]);
        } else {
            System.out.print(mag_rev[front]);
        }
    }
}
