import java.util.Scanner;

public class Ch01_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x, y, z;
        sc.close();

        x = n / 10;
        n %= 10;
        y = n / 3;
        z = n % 3;
        System.out.print(x + " " + y + " " + z);        
    }
}
