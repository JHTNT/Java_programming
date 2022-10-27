import java.util.Scanner;

public class Ch07_hw_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();

        System.out.print(a.toUpperCase() + "\n" + a.toLowerCase());
    }
}
