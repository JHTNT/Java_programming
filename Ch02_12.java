import java.util.Scanner;

public class Ch02_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next();
        System.out.println(sc.next());
        System.out.print(sc.nextLine().substring(1));
        sc.close();
    }
}
