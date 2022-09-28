import java.util.Scanner;

public class Ch01_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height, weight, bmi;
        height = sc.nextDouble();
        weight = sc.nextDouble();
        sc.close();

        // floor 只能取整，所以要手動變成小數
        bmi = Math.floor((weight / Math.pow(height / 100, 2)) * 10) / 10;
        System.out.print(bmi);
    }
}
