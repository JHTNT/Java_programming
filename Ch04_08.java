import java.text.DecimalFormat;
import java.util.Scanner;

public class Ch04_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.close();

        DecimalFormat df = new DecimalFormat("0.00%");
        System.out.print(df.format(x));
    }
}
