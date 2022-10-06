import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ch04_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.close();

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
        nf.setMaximumFractionDigits(2);
        System.out.print(nf.format(x));
    }
}
