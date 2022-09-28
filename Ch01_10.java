import java.math.BigInteger;
import java.util.Scanner;

public class Ch01_10 {
    // 用 BigInteger 進行極大數運算
    static BigInteger fact(int n) {
        BigInteger store_fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++){
            store_fact = store_fact.multiply(BigInteger.valueOf(i));
        }
        return store_fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.print(fact(n));
    }
}
