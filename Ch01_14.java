import java.util.Scanner;

public class Ch01_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt(), min;
        sc.close();

        min = sec % 3600 / 60;
        System.out.print(min);
    }
}
