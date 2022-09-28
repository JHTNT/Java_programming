import java.util.Scanner;

public class Ch01_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        double dis;
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();

        dis = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (dis <= 100) {
            System.out.print("inside");
        } else {
            System.out.print("outside");
        }
    }
}
