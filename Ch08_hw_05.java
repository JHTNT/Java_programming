import java.util.Scanner;

public class Ch08_hw_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mag[] = new int[n];
        for (int i = 0; i < n; i++) mag[i] = sc.nextInt();
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
                    System.out.print(mag[i] + " ");
                }
                System.out.println();
                back--;
            }
            cnt++;
        }
        System.out.print(mag[front]);
    }
}
