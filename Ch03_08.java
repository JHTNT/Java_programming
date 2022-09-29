import java.util.Scanner;

public class Ch03_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), s2 = sc.next();
        sc.close();

        System.out.print(s1.indexOf(s2));
    }
}
