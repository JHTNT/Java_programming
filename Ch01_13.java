import java.util.Scanner;

public class Ch01_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt(), time;
        sc.close();

        time = (int) Math.ceil(distance / (1 - 2.54 * 30 / 100));
        System.out.print(time);
    }
}
