import java.util.Scanner;

public class Ch07_hw_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b;

        if (sc.hasNextLine()) {
            b = sc.nextLine();
            System.out.print(a + b.toUpperCase());
        } else {
            System.out.print(a);
        }
        sc.close();
    }
}
