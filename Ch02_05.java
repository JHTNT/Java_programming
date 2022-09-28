import java.util.Scanner;

public class Ch02_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mol = sc.nextDouble(), ph;
        sc.close();

        ph = 14 + Math.log10(mol);
        // 數值上 0.0 == -0.0，但使用 equals() 結果為 false
        if (ph == 0.0) ph = 0.0;
        System.out.printf("%.2f", ph);
    }
}
