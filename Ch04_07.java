import java.text.DecimalFormat;
import java.util.Scanner;

public class Ch04_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.close();

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(x));
        df.applyPattern("0.000");       // change format pattern
        System.out.print(df.format(x));
    }
}
