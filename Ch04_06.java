import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ch04_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.close();

        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        nf1.setMaximumFractionDigits(2);
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
        nf2.setMaximumFractionDigits(2);
        System.out.println(nf1.format(x));
        System.out.print(nf2.format(x));
    }
}
