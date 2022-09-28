import java.util.Scanner;

public class Ch02_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount, price, sum = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print(sc.next());
            amount = sc.nextInt();
            price = sc.nextInt();
            System.out.println(" " + amount + " " + price + " " + amount * price);
            sum += amount * price;
        }
        sc.close();
        System.out.print("sum " + sum);
    }
}
