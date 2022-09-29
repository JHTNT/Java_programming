import java.util.Scanner;

public class Ch02_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("#|\n");
        String s1 = sc.next(), s2 = sc.next(), s3 = sc.next();
        sc.close();

        System.out.print(s1 + "\n" + s2 + "\n" + s3);
    }
}
